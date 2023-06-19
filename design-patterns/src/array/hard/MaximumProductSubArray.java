package array.hard;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{1,2,-3,0,-4,-5}));
    }

    public static int logic(int[] arr) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}
