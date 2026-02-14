package striver.bitmani;

import java.util.ArrayList;
import java.util.List;

public class GetPrimeFactorsOfNumber {
    public static void main(String[] args) {
        List<Integer> integers = countPrimes(45);
        System.out.println(integers);
    }

    public static List<Integer> countPrimes(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans.add(i);
                while (n % i == 0)
                    n = n / i;
            }
        }
        if (n > 1) {
            ans.add(n);
        }
        return ans;
    }
}
