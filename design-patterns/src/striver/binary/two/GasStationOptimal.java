package striver.binary.two;

public class GasStationOptimal {
    public static double minimiseMaxDistance(int []arr, int k){
        double low = 0;
        double high = 0;

        for(int i=0;i<arr.length - 1;i++){
            high = Math.max(high, (double)arr[i+1] - arr[i]);
        }

        double diff = 1e-6 ;
        while (high - low > diff) {
            double mid = (low + high) / (2.0);
            if (isPossible(arr,k,mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }

    public static boolean isPossible(int[] arr,int k,double dist){
        int n = arr.length;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt<=k;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,13,17,23};
        double v = minimiseMaxDistance(ints, 5);
        System.out.println(v);
        System.out.println(1e6);
    }
}
