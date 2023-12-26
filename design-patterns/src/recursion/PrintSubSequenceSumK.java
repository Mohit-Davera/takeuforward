package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequenceSumK {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2};
        printSubSeq(nums,0,new ArrayList<>());
    }

    static void printSubSeq(int[] nums, int i, List<Integer> curr){
        if(i == nums.length){
            System.out.println(curr);
            return;
        }

        curr.add(nums[i]);
        printSubSeq(nums,i+1,curr);

        curr.remove(curr.size() - 1);
        printSubSeq(nums,i+1,curr);
    }
}
