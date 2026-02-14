package striver.binary.one;

public class PeekElement {

    public static void main(String[] args) {
        System.out.println(logic(new int[]{1,2,1,3,5,6,4}));
    }

    public static int logic(int[] arr){
        int low = 1;
        int n = arr.length;
        int high = n - 1;

        if(n == 1 || arr[0] >= arr[1] )
            return 0;
        if(arr[n - 1] >= arr[n - 2])
            return n-1;

        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]){
                return mid;
            } else if (arr[mid] >= arr[mid - 1]) {
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
