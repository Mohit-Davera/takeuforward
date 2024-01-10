package sort;

public class MajorityNByTwo {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n  = arr.length;
        int element = 0;
        int count = 0;
        for (int k : arr) {
            if (count == 0) {
                count = 1;
                element = k;

            } else if (element == k) {
                count++;
            } else {
                count--;
            }
        }
        int elementCount = 0;
        for (int j : arr) {
            if (j == element)
                elementCount++;

        }
        if(elementCount>(n/2))
            System.out.println(element);
        else
            System.out.println(-1);
    }


}
