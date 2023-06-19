package binary.one;

public class SearchInsertK {
    public static void main(String[] args) {
        System.out.println(searchInsertK(new int[]{1, 3, 5, 6},
                7));
    }

    static int searchInsertK(int[] arr, int k) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;

    }
}
