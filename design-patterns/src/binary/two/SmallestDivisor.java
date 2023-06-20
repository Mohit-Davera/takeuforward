package binary.two;

public class SmallestDivisor {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{1,2,5,9},6));
    }

    public static int logic(int[] arr,int k){
        int low = 1;
        int high = k;
        int lowest = k;

        while(low<=high){
            int mid = (low+high)/2;

            if(isValidMid(arr,mid,k)){
                lowest = mid;
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return lowest;
    }

    public static boolean isValidMid(int[] arr,int mid,int k){
        int countDiv = 0;
        for (int i :
                arr) {
            double ceil = Math.ceil((double) i / mid);
            countDiv += ceil;
        }
        return countDiv<=k;
    }

}
