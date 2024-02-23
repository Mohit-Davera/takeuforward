package aditya_stack;

import java.util.Stack;

public class SubArraySumMinimum {


    /*
    [2, 9, 7, 8, 3, 4, 6, 1], the subarray using 3 as minimal is we need to choose a start index and an end index.
    How many choices we have for start index, it is 4 which are (9,7,8,3),
    how many choices we have for end index, it is 3 which are (3, 4, 6).
    Then the combination number of sub array using 3 as minimal is 4 * 3.
    */
    public static void main(String[] args) {
        int[] arr = {4, -2, -3, 4, 1};
        int min = sumSubArrayMin(arr);
        int max = sumSubArrayMax(arr);
        System.out.println(max - min);
    }

    public static int logic(int[] arr) {
        Stack<Integer> stp = new Stack<>();
        int al = arr.length;
        int[] left = new int[al];
        int[] right = new int[al];

        // find PLE
        for (int i = 0; i < al; i++) {
            while (!stp.isEmpty() && arr[stp.peek()] > arr[i]) {
                stp.pop();
            }
            left[i] = stp.isEmpty() ? i + 1 : i - stp.peek();
            stp.push(i);
        }

        stp = new Stack<>();
        // find NLE
        for (int i = al - 1; i >= 0; i--) {
            while (!stp.isEmpty() && arr[stp.peek()] >= arr[i]) {
                stp.pop();
            }
            right[i] = stp.isEmpty() ? al - i : stp.peek() - i;
            stp.push(i);
        }

        long ans = 0;
        for (int i = 0; i < al; i++) {
            ans = (ans + (long) arr[i] * left[i] * right[i]) % (long) (1e7);
        }
        return (int) ans;
    }


    public static int sumSubArrayMin(int[] arr) {
        int n = arr.length;
        int j;
        int k;
        long res = 0;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && arr[s.peek()] > (i == n ? Integer.MIN_VALUE : arr[i])) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res += (long)arr[j] * (i - j) * (j - k);

            }
            s.push(i);
        }
        return (int) res;
    }

    public static int sumSubArrayMax(int[] arr) {
        int n = arr.length;
        int j;
        int k;
        long res = 0;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && arr[s.peek()] < (i == n ? Integer.MAX_VALUE : arr[i])) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res += (long)arr[j] * (i - j) * (j - k);

            }
            s.push(i);
        }
        return (int) res;
    }

    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        long ans = 0;
        long mod = (long)1e9 + 7;
        for(int i = 0;i<=n;i++){
            int curr = i == n ? Integer.MIN_VALUE : arr[i];

            while(!st.isEmpty() && arr[st.peek()] > curr){
                int main = st.pop();
                int ls = st.isEmpty() ? -1 : st.peek();
                ans += (long)arr[main] * (main - ls) * (i - main);
                ans %= mod;
            }
            st.push(i);
        }
        return (int)ans;
    }
}
