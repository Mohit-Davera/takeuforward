package aditya_stack;

public class RainTripping {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    static int solution(int[] height){
        int n = height.length;
        int[] maxl = new int[n];
        maxl[0] = height[0];
        for(int i = 1;i<n;i++){
            maxl[i] = Math.max(maxl[i-1],height[i]);
        }

        int[] maxr = new int[n];
        maxr[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            maxr[i] = Math.max(maxr[i+1],height[i]);
        }


        int ans = 0;

        for(int i = 0;i<n;i++){
            ans += Math.min(maxl[i],maxr[i]) - height[i];
        }

        return ans;
    }
}
