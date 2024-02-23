package greedy;

import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] brr = {3,4};
        float sjf = sjf(arr.length, arr, brr);
        System.out.println(sjf);
    }

    public static float sjf(int n, int []arrivalTime, int []burstTime)
    {
        int[] waitingTime = new int[n];
        int[] completed = new int[n];

        int systemTime = 0;
        int totalProcesses = 0;
        float avgWaitingTime = 0;

        // Initializing all processes as undone.
        Arrays.fill(completed, 0);

        // Till all the processes are done.
        while (totalProcesses != n) {
            int check = n;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                // If the process arrival time is less than system time, and it is not completed
                // and burstTime is smallest of this process will be executed first.
                if ((arrivalTime[i] <= systemTime) && (completed[i] == 0) && (burstTime[i] < min)) {
                    min = burstTime[i];
                    check = i;
                }
            }

            // No process in the queue.
            if (check == n) {
                systemTime++;
            } else {
                waitingTime[check] = systemTime - arrivalTime[check];
                systemTime += burstTime[check];
                completed[check] = 1;
                totalProcesses++;
            }
        }

        // Sum for calculating averages.
        for (int i = 0; i < n; i++) {
            avgWaitingTime += waitingTime[i];
        }

        float ans;

        ans = (avgWaitingTime / arrivalTime.length);
        return ans;
    }
}
