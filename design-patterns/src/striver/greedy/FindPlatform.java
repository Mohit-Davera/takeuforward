package striver.greedy;

import java.util.Arrays;

public class FindPlatform {
    public static void main(String[] args) {

    }


    //we only care about platform are occupied or not
    // so we striver.sort both striver.array and check whether at particular
    // arrival time how many trains are present at platform
    public static int logic(int[] arr,int[] dep,int n){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int maxp = 1;
        int platform = 1;
        int i = 1;
        int j = 0;

        while(i < n && j < n){
            if(dep[j] < arr[i]){
                platform--;
                j++;
            }
            else if(dep[j] >= arr[i]){
                platform++;
                i++;
            }

            maxp = Math.max(maxp,platform);
        }
        return maxp;
    }
}
