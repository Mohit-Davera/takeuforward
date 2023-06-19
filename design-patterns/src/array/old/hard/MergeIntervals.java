package array.old.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{6,8},{1,9},{2,4},{4,7}};
        System.out.println(Arrays.deepToString(logicc(arr)));
    }

    public static int[][] logicc(int[][] intervals){
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        if(intervals.length == 0){
            return list.toArray(new int[][]{});
        }
        int first = intervals[0][0];
        int end = intervals[0][1];


        for (int[] element :
                intervals) {
            if(element[0]<=end){
                end = Math.max(end,element[1]);
            }else{
                list.add(new int[]{first,end});
                first = element[0];
                end = element[1];
            }
        }
        list.add(new int[]{first,end});
        return list.toArray(new int[0][]);
    }
}
