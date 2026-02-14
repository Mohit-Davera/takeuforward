package striver.binary.one;

public class FindSmallestInSortedRotated {

    public static void main(String[] args) {
        System.out.println(logic(new int[]{3,4,5,1,2}));
    }

    public static int logic(int[] arr){
        int low = 0;
        int high = arr.length -1;
        int smallest = Integer.MAX_VALUE;
        while (low<=high){
            int mid = (low + high) /2;
            if(arr[low] <= arr[mid]){
                smallest = Math.min(smallest,arr[low]);
                low = mid + 1;
            }else{
                smallest = Math.min(smallest,arr[mid]);
                high = mid - 1;
            }
        }
        return smallest;
    }
}
