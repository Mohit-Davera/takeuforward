package aditya_stack;

public class RainTrippingTuf {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    static int solution(int[] arr){
        int n = arr.length;
        int ans = 0;
        int l = 0;
        int r = n-1;
        int lMax = 0;
        int rMax = 0;

        while(l<=r){
            if(arr[l] <= arr[r]){
                if(arr[l] > lMax ) lMax = arr[l];
                else ans += lMax - arr[l];
                l++;
            }else{
                if(arr[r] > rMax ) rMax = arr[r];
                else ans += rMax - arr[r];
                r--;
            }
        }

        return ans;
    }
}
