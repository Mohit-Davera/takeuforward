package striver.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindFactorsOfNumber {
    public static void main(String[] args) {
        List<Integer> factor = factor(36);
        System.out.println(factor);
    }

    public static List<Integer> factor(int n){
        List<Integer> integers = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if( n % i == 0){
                integers.add(i);
                if(i != n/i)
                    integers.add(n/i);
            }
        }
        Collections.sort(integers);
        return integers;
    }
}
