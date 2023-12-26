package sort;

public class Bubble {
    public static void main(String[] args) {
//        int[] arr = {5, 6, 4, 2, 1, 3, 7};
//        bubble(arr, arr.length);
//        recursiveBubble(arr, arr.length - 1);
//        insertion(arr,arr.length);
//        recursiveInsertion(arr,1, arr.length);
//        int arr[] = {1,1,2,2,2,3,3};
//        removeDuplicates(arr);
        int arr[] ={ 1,2,0,1,0,4,0};
        moveZeros(arr, arr.length);
        for (int i :
                arr) {
            System.out.println(i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    swap(arr, j, j + 1);
                }
            }
            if (!isSwapped)
                return;
        }
    }

    public static void recursiveBubble(int[] arr, int n) {
        if (n == 1)
            return;
        boolean isSwapped = false;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                isSwapped = true;
            }
        }
        if (!isSwapped) return;
        recursiveBubble(arr, n - 1);
    }

    public static void recursiveInsertion(int arr[], int i,int n) {
        if (i == n) return;
        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            swap(arr, j, j - 1);
            j--;
        }
        recursiveInsertion(arr, i + 1,n);
    }

    public static void insertion(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void removeDuplicates(int arr[]){
        int n = arr.length;
        int currentIndex = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[currentIndex]){
                currentIndex++;
                arr[currentIndex] = arr[i];
            }
        }
    }

    public static void moveZeros(int[] arr,int n){
        int zeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                swap(arr,zeroIndex,i);
                zeroIndex++;
            }
        }
    }
}
