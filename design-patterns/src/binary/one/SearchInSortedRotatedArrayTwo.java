package binary.one;

public class SearchInSortedRotatedArrayTwo {
    public static void main(String[] args) {

        System.out.println(logic(new int[]{2 ,5, 6, 0, 0, 1, 2}, 0));
    }

    public static int logic(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
            //left sorted;
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            //right sorted
            else {
                if (arr[mid] <= k && k <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
