package striver.recursion.one;

public class SortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,-1,2,-3};
        recursionLogic(arr,arr.length-1);
        for(int i : arr) System.out.print(i+" ");
    }

    public static void recursionLogic(int[] arr,int index){
        if(index == 0) return;
        recursionLogic(arr,index-1);
        insert(arr,index);
    }

    public static void insert(int[] arr,int index){
        int key = arr[index];
        int low = 0;
        int high = index - 1;
        int ans = index;
        while(low <= high){
            int mid = (low + high) >> 1;
            if(arr[mid] > key){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        for(int i = index - 1;i>=ans;i--){
            arr[i+1] = arr[i];
        }
        arr[ans] = key;

    }
}
