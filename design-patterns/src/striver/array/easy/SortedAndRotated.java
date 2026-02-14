package striver.array.easy;

public class SortedAndRotated {
    public boolean check(int[] nums) {
        int len = nums.length;
        int breakIndex = 0;
        for(int i=1; i<len;i++)
        {
            if(nums[i-1] > nums[i]){
                breakIndex++;
            }
        }
        if(nums[len-1]>nums[0]){
            breakIndex++;
        }
        return breakIndex == 1;
    }

    public static void main(String[] args) {
        boolean check = new SortedAndRotated().check(new int[]{1,2,3});
        System.out.println(check);
    }
}
