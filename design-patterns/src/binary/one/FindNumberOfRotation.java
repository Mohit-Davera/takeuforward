package binary.one;

public class FindNumberOfRotation {

    public static void main(String[] args) {
        System.out.println(logic(new int[]{3,4,5,1,2}));
    }

    public static int logic(int[] arr){
        int index = -1;
        int low = 0;
        int high = arr.length -1;
        int smallest = Integer.MAX_VALUE;
        while (low<=high){
            int mid = (low + high) /2;
            if(arr[low] <= arr[mid]){
                if(arr[low] <= smallest){
                    smallest = arr[low];
                    index  = low;
                }
                low = mid + 1;
            }else{
                smallest = Math.min(smallest,arr[mid]);
                if(arr[mid] <= smallest){
                    smallest = arr[mid];
                    index  = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}
