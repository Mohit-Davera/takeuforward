package array.old.hard;

public class Pascal {
    public static void main(String[] args) {
        int res = 1;
        int n = 3;
        for (int j = 0; j <= n; j++) {
            res = 1;
            for(int i =0;i<j;++i)
            {
                res *= (n-i);
                res /= (i+1);
            }
            System.out.println(res);
        }
        //System.out.println(res);
    }
}
