package striver.greedy;

import java.util.Arrays;

public class JobSchedulingDeadline {

    //we try to schedule as close to deadline so we can accomodate early deadline jobs also
    // in other words just try to do job as late as possible
    public static void main(String[] args) {
        int n = 4;

        Job[] arr = new Job[n];
        arr[0] = new Job(1,4,20);
        arr[1] = new Job(2,1,10);
        arr[2] = new Job(3,1,40);
        arr[3] = new Job(4,1,30);

        logic(arr,n);

    }

    static int[] logic(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> Integer.compare(b.profit, a.profit));

        int lastDeadline = 0;
        for (Job i : arr) {
            lastDeadline = Math.max(lastDeadline, i.deadline);
        }

        int profit = 0;
        int jobs = 0;

        int[] schedule = new int[lastDeadline + 1];

        for (int i = 0; i < n; i++) {

            for (int j = arr[i].deadline; j > 0; j--) {
                if (schedule[j] == 0) {
                    schedule[j] = arr[i].id;
                    profit += arr[i].profit;
                    jobs++;
                    break;
                }
            }
        }

        return new int[]{jobs, profit};
    }

    static class Job {
        int id;
        int profit;
        int deadline;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
}
