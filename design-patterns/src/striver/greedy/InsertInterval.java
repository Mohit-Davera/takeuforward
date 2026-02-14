package striver.greedy;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 5}};
        int[] newI = {0, 0};

        insert(intervals, newI);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] <= newInterval[0] && newInterval[0] <= intervals[i][1]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            intervals[index][0] = Math.min(intervals[index][0], newInterval[0]);
            intervals[index][1] = Math.max(intervals[index][1], newInterval[1]);
            return mergeIntervals(intervals);
        } else {
            int[][] ans = new int[n + 1][2];
            //add at first
            if (newInterval[0] < intervals[0][0]) {
                for (int i = 1; i <= n; i++) {
                    ans[i] = intervals[i - 1];
                }
                ans[0] = newInterval;
            }
            //at last
            else {
                for (int i = 0; i < n; i++) {
                    ans[i] = intervals[i];
                }
                ans[n] = newInterval;
            }
            return ans;
        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            //does not lie in previous interval
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < intervals[i][0]) {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            //lies in this interval
            else {
                int[] last = ans.get(ans.size() - 1);
                last[1] = Math.max(last[1], intervals[i][1]);
            }
        }
        return ans.toArray(new int[0][]);
    }

    public static int[][] optimisedSolution(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        // Iterate through all slots
        for (int[] slot : intervals) {

            // if newInterval before slot insert newInterval & update slot as new interval
            if (newInterval[1] < slot[0]) {
                result.add(newInterval);
                newInterval = slot;
            }

            // if slot is lesser than new Interval insert slot
            else if (slot[1] < newInterval[0]) {
                result.add(slot);
            }

            // if above conditions fail its an overlap since possibility of new interval existing in left & right of slot is checked
            // update lowest of start & highest of end & not insert
            else {
                newInterval[0] = Math.min(newInterval[0], slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);
            }
        }

        // insert the last newInterval
        result.add(newInterval);

        // convert to int[][] striver.array
        return result.toArray(new int[result.size()][]);
    }
}
