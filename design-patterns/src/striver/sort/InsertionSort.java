package striver.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 2, 1, 3, 7};
        selectionSort(arr);


    }

    public static void logic(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j  = i;
            int temp = arr[i];
            while(j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        print(arr);
    }

    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        int min;
        int minIndex = 0;
        for(int i = 0;i<n-1;i++){
            min = arr[i];
            minIndex = i;
            for(int j = i+1;j<n;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = t;
        }
        print(arr);
    }
}
