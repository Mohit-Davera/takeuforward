package striver.heap.intro;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C', 'C'};
//        System.out.println(logic(tasks,2));
        tasks = new char[]{'A', 'A', 'A', 'A'};
        System.out.println(logic(tasks, 2));
    }

    public static int logic(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        HashMap<Character, Integer> map = new HashMap<>();
        for (char t : tasks) {
            map.merge(t, 1, Integer::sum);
        }
        Queue<int[]> q = new LinkedList<>();


        pq.addAll(map.values());

        int time = 0;
        while (!pq.isEmpty()) {
            int task = pq.poll();
            time++;
            if (task != 1)
                q.add(new int[]{task - 1, time + n});
            if (!q.isEmpty() && q.peek()[1] <= time) {
                pq.add(q.poll()[0]);
            }
            if (!q.isEmpty() && pq.isEmpty()) {
                time += (q.peek()[1] - time);
                pq.add(q.poll()[0]);
            }
        }

        return time;
    }

    public static int greedy(char[] tasks, int n) {
        /**
         * The problem actually requires us to make the "distance"
         * between two same tasks up to at least n.Thus,
         * if emptySlots is negative, it means that we even have
         * remaining tasks to make the "distance" between same tasks longer than n.
         * That is, no idle is needed.
         */

        int max = 0;
        //if maxFreq tasks are more than one;
        //we would merge same freq tasks as one big task
        int maxC = 0;

        char[] hash = new char[26];

        for(char c : tasks){
            hash[c-'A']++;
            if(max == hash[c-'A']) maxC++;
            else if(max < hash[c-'A']){
                max = hash[c-'A'];
                maxC = 1;
            }
        }

        int gap = max - 1;
        int gapLen = n - (maxC - 1);
        int gapSlots = gapLen * gap;
        int otherTasks = tasks.length - max * maxC;
        int idles = Math.max(0,gapSlots - otherTasks);

        return tasks.length + idles;
    }
}
