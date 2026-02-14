package striver.recursion.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysWithSumK {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1};
        List<List<Integer>> naive = subarraysWithSumK(a, 3);
        System.out.println(naive);

    }

    public static List< List < Integer > > subarraysWithSumK(int []a, long k) {
        long sum = 0;
        int n = a.length;

        List< List < Integer > > ans = new ArrayList<>();
        Map<Long,Integer> map = new HashMap<>();

        map.put(0L,-1);

        for(int i = 0;i<n;i++){
            sum+=a[i];
            if(map.containsKey(sum - k)){
                ans.add(createSubArray(a,map.get(sum-k) + 1,i));
            }
            map.put(sum,i);
        }
        return ans;
    }

    public static List<Integer> createSubArray(int[] a,int start,int end){

        List<Integer> arr = new ArrayList<>();
        for(int i = start;i<=end;i++){
            arr.add(a[i]);
        }

        return arr;
    }

}
