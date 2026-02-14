package striver.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 2, 1, 3, 7};
        logic(arr);


    }

    public static void logic(int[] arr){
        int n = arr.length;
        boolean swap;
        for(int i = 0;i<n-1;i++){
            swap = false;
            for(int j = i+1;j<n-1;j++){
                if(arr[i] > arr[j]){
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swap)
                break;
        }
        print(arr);
    }

    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
