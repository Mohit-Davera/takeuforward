package array.hard.old;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {-1,0,0,3,3,3,0,0,0};
        int[] b = {1, 2, 2};
        leetcodeLogic(a, 6, b,3);
        for (int i :
                a) {
            System.out.print(i + " ");
        }
/*        gap(a,b,a.length, b.length);
        insertionLogic(a,b,a.length,b.length);
        for (long one : a
                ) {
            System.out.print(one + " ");
        }
        for (long one : b
        ) {
            System.out.print(one + " ");
        }*/
    }

    public static void insertionLogic(long[] arr1, long[] arr2, int n, int m) {
        int traversal = n;
        int startOne = 0;
        while (traversal >= 1) {
            int startTwo = 0;
            if (arr1[startOne] >= arr2[startTwo]) {
                swap(arr1, arr2, startOne, startTwo);
                long temp = arr2[startTwo];
                while (startTwo < m - 1 && temp > arr2[startTwo + 1]) {
                    arr2[startTwo] = arr2[startTwo + 1];
                    startTwo++;
                }
                arr2[startTwo] = temp;
            }
            startOne++;
            traversal--;
        }
    }

    public static void gap(long[] arr1, long[] arr2, int n, int m) {
        int gap = (int) Math.ceil((double) (n + m) / 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (n + m)) {
                if (j < n && arr1[i] > arr1[j]) {
                    swap(arr1, arr1, i, j);
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    swap(arr1, arr2, i, j - n);
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    swap(arr2, arr2, i - n, j - n);
                }
                j++;
                i++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap = (int) Math.ceil((double) gap / 2.0);
            }
        }
    }

    public static void swap(long[] arr1, long[] arr2, int indexOne, int indexTwo) {
        long temp = arr1[indexOne];
        arr1[indexOne] = arr2[indexTwo];
        arr2[indexTwo] = temp;
    }


    public static void leetcodeLogic(int[] arr1, int m, int[] arr2, int n) {
        int i = 0;
        int j = 0;
        int[] temp = new int[arr1.length];
        int k = 0;
        while (k < arr1.length) {
            if ( i >=m && arr1[i] == 0) {
                temp[k] = arr2[j];
                j++;
            } else if (j < n && arr1[i] > arr2[j]) {
                temp[k] = arr2[j];
                j++;
            } else {
                temp[k] = arr1[i];
                i++;
            }
            k++;
        }
        System.arraycopy(temp, 0, arr1, 0, temp.length);
    }
}
