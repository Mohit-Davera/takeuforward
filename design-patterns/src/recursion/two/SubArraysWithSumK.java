package recursion.two;

import java.util.*;

public class SubArraysWithSumK {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1};
        List<List<Integer>> lists = subarraysWithSumK(a, 3);
//        PrintSubSequenceSumK.printAllSubSeq(a,3,0,new ArrayList<>());
        System.out.println(lists);
    }
    public static List< List < Integer > > subarraysWithSumK(int []a, int k) {
        Set< List < Integer > > ans = new HashSet<>();
        pain(ans,new ArrayList<>(),0,a,k);
        return new ArrayList<>(ans);
    }

    public static void pain(Set<List<Integer>> ans, List<Integer> curr,int index,int[] a,int k){
        if(index == a.length){
            if(k == 0){
                System.out.println(curr);
//                Collections.sort(curr);
                ans.add(new ArrayList(curr));
            }
            return;
        }

        curr.add(a[index]);
        pain(ans,curr,index + 1,a,k-a[index]);
        curr.remove(curr.size() - 1);
        pain(ans,curr,index + 1,a,k);
    }
}
