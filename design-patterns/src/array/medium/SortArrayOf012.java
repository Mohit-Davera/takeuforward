package array.medium;

public class SortArrayOf012 {
    public static void logic(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (a[mid]){
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0, 2};
        logic(arr);
        for (int i :
                arr) {
            System.out.println(i);

        }
    }
}
