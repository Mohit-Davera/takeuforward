package sort;

public class ArrangePosNeg {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        int posIndex = 0;
        int negIndex = 1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        for (int i :
                ans) {
            System.out.print(i + " ");
        }
    }
}
