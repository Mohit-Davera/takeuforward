package binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,7,10,13,14,17};
        int k = 14;

        int start = 0;
        int end = arr.length - 1;

        int loc = logicIterative(arr, k);

        if (loc == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + k + " Found at " + loc + " index");
        }
    }

    public static int logicRecursive(int[] arr, int low, int high, int key){
        if (low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                return logicRecursive(arr,mid+1,high,key);
            }
            else{
                return logicRecursive(arr, low, mid-1, key);
            }
        }
        return -1;
    }

    public static int logicIterative(int[] arr, int key){
        int low = 0;
        int high = arr.length -1;

        while (low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
