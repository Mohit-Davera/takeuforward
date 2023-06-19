package binary.one;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        System.out.println(floor(arr,0));
    }

    public static int floor(int arr[], int target) {
        int low = 0;
        int ans = -1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
}
