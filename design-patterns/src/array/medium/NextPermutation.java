package array.medium;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,1,5,1};
        logic(arr);
        for (int i :
                arr) {
            System.out.print(i+" ");
        }
    }

    public static void logic(int[] arr) {
        int length = arr.length;
        int i = length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        if (i >= 0) {
            int j = length - 1;
            while (arr[i] >= arr[j])
                j--;
            swap(arr,i,j);
        }
        reverse(arr,i + 1 , length -1);
    }


    public static void swap(int[] nums, int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }

    public static void reverse(int[] arr,int start,int end){
        while (start<end)
            swap(arr,start++,end--);
    }
}
