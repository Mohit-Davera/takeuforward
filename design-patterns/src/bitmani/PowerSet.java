package bitmani;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        getPowerSet(new int[]{3,2,4});
    }

    public static List<List<Integer>> getPowerSet(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int noOfSubsets = 1 << n;
        for(int i = 0; i< noOfSubsets; i++){
            List<Integer> integers = new ArrayList<>();
            for(int bit = 0;bit<n;bit++){
                if( (i & (1<<bit)) >= 1 ){
                    integers.add(arr[bit]);
                }
            }
            ans.add(new ArrayList<>(integers));
        }

        System.out.println(ans);
        return ans;
    }
}
