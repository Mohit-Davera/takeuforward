package aditya_stack;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{6,2,5,4,5,1,6}));
    }
    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Arrays.fill(prevSmaller, -1);
        Arrays.fill(nextSmaller, n);

        for(int i = n - 2; i >= 0; i--){
            for(int j = i + 1; j < n;){
                if(heights[j] < heights[i]){
                    nextSmaller[i] = j;
                    break;
                } else {
                    if(nextSmaller[j] == n) break;
                    else j = nextSmaller[j];
                }
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = i - 1; j >= 0;){
                if(heights[j] < heights[i]){
                    prevSmaller[i] = j;
                    break;
                } else {
                    if(prevSmaller[j] == -1) break;
                    else j = prevSmaller[j];
                }
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            res = Math.max(res, heights[i] * (nextSmaller[i] - prevSmaller[i] - 1));
        }
        return res;
    }
}
