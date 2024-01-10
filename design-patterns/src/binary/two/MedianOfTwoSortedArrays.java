package binary.two;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] a = {2,3,6,15};
        int[] b = {1,3,4,7,10,12};

//        int[] a = {2,4,6};
//        int[] b = {1,3};
        System.out.println(median(a,b));
    }

    public static double median(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        if(n > m) return median(b,a);

        int low = 0;
        int high = n;
        int total = (n + m + 1)/2;

        while(low <= high){
            int cut1 = low + high >> 1;
            int cut2 = total - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2 - 1];

            int r1 = cut1 == n ? Integer.MAX_VALUE : a[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : b[cut2];

            if(l1 <= r2 && l2 <= r1){
                if((n+m) % 2 == 0) {
                    return ((double)(Math.max(l1,l2) + Math.min(r1,r2)))/2.0;
                }
                else{
                    return Math.max(l1,l2);
                }
            } else if (l2>r1) {
                low = cut1 + 1;
            }
            else {
                high = cut1 - 1;
            }
        }
        return 0.0;
    }
}
