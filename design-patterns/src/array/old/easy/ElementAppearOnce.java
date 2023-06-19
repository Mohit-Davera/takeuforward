package array.old.easy;

public class ElementAppearOnce {
    public static int bruteforce(int A[], int N) {
        int ans = 0;
        for (int i = 1; i < N; i++) {
            if (A[i - 1] != A[i]) {
                if (A[i] == A[i + 1]) {
                    ans = A[i - 1];
                } else {
                    ans = A[i];
                }
                break;
            }
        }
        return ans;
    }

    public static int binaryTrial(int arr[], int low, int high, int N) {


        if(low == high)
            return arr[low];
        int mid = (high + low)/2;

        if(mid%2==0){
            if(arr[mid] == arr[mid + 1]){
                return binaryTrial(arr,mid + 2 , high, arr.length);
            }
            else{
                return binaryTrial(arr,low, mid, arr.length);
            }
        }
        else{
            if(arr[mid-1] == arr[mid]){
               return binaryTrial(arr,mid + 1 , high, arr.length);
            }
            else{
                return binaryTrial(arr,low, mid - 1, arr.length);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {11,11,12,12,13,14,14};
        int search = binaryTrial(a,0,a.length ,a.length);
        System.out.println(search);
    }
}
