package array.slidingwindow;

public class FindMaxSumOfSubArrayOfSizeK {

    static int logic(int[] arr,int k){
        int length = arr.length;
        int start = 0;
        int end = 0;
        int maxSum = 0;
        int currentMax = 0;
        while(end < length){
            currentMax += arr[end];
            if(end-start +1 >= k) {
                maxSum = Math.max(maxSum,currentMax);
                currentMax = currentMax - arr[start];
                start++;
            }
            end++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int logic = logic(new int[]{2, 5, 1, 8, 2, 9, 1}, 3);
        System.out.println(logic);
    }
}
