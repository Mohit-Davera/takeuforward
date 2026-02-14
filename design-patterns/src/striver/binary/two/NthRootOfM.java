package striver.binary.two;

public class NthRootOfM {
    public static void main(String[] args) {
        System.out.println(logic(2,9));
    }

    public static int logic(int n, int m){
        int low = 1;
        int high = m;

        while(low<=high){
            int mid = (low +high )/2;
            double pow = Math.pow(mid, n);
            if(pow == m){
                return mid;
            } else if (pow>m) {
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
