package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequenceSumK {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println("PRINT ALL SUB SEQUENCE");
        printAllSubSeq(nums, 2, 0, new ArrayList<>());
        System.out.println("PRINT ONE SUB SEQUENCE");
        printOneSubSeq(nums, 2, 0, new ArrayList<>());
        System.out.println("COUNT SUB SEQUENCE");
        int count = countSubSeqSumK(nums, 2, 0);
        System.out.println(count);

    }

    static void printAllSubSeq(int[] nums, int target, int i, List<Integer> curr) {
        if (i == nums.length) {
            if (target == 0){
                System.out.println(curr);
            }
            return;
        }

        curr.add(nums[i]);
        printAllSubSeq(nums, target-nums[i], i+1, curr);

        curr.remove(curr.size() - 1);
        printAllSubSeq(nums, target, i+1, curr);
    }

    static boolean printOneSubSeq(int[] nums, int target,int i, List<Integer> curr) {
        if (i == nums.length) {
            if (target == 0){
                System.out.println(curr);
                return true;
            }
            return false;
        }

        curr.add(nums[i]);
        if(printOneSubSeq(nums, target-nums[i], i+1, curr)){
            return true;
        }
        curr.remove(curr.size() - 1);
        return printOneSubSeq(nums, target, i+1, curr);
    }

    static int countSubSeqSumK(int[] nums, int target,int i) {
        if (i == nums.length) {
            if (target == 0){
                return 1;
            }
            return 0;
        }

        int left = countSubSeqSumK(nums, target-nums[i], i+1 );
        int right = countSubSeqSumK(nums, target, i + 1 );
        return left + right;
    }
}
