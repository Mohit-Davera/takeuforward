package array.random;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1235 {

    private class Job {
        int start;
        int finish;
        int profit;
        Job(int start, int finish, int profit) {
            this.start = start;
            this.finish = finish;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int[] start = {1,2,3,3};
        int[] end = {3,4,5,6};
        int[] profit = {50,10,40,70};
        int maxProfit = new LeetCode1235().jobScheduling(start, end, profit);
        System.out.println(maxProfit);
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobs = new Job[startTime.length];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(startTime[i],endTime[i],profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.start));
        int[] dp = new int[startTime.length];
        Arrays.fill(dp,-1);
        return getMaximumProfit(jobs,0,dp);
    }

    public int getMaximumProfit(Job[] jobs, int index, int[] dp){
        if(index == jobs.length){
            return 0;
        }
        int profit = getMaximumProfit(jobs,index + 1,dp);
        int j = nextJobSearch(jobs,index + 1,jobs[index].finish);
        return Math.max(profit,jobs[index].profit + getMaximumProfit(jobs,j,dp));
    }

    public int nextJobSearch(Job[] jobs,int index,int finishTime){
        int low = index;
        int high = jobs.length - 1;
        int ans = jobs.length;

        while(low<=high){
            int mid = low + high >> 1;

            if(jobs[mid].start>=finishTime){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
