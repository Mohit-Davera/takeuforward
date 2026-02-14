package striver.array.hard;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {


/*        //first type
        System.out.println(firstType(5, 3));
        //reduce by one then apply formula

        System.out.println(secondType(5));*//*

        List<List<Integer>> lists = thirdType(5);
        lists.forEach(System.out::println);*/

        System.out.println(secondType(6));
    }

    public static int firstType(int row, int col) {
        row--;
        col--;
        int ans = 1;
//        rowCcol
        for (int i = 0; i < col; i++) {
            ans = ans * (row - i);
            ans = ans / (i + 1);
        }
        return ans;
    }
    //5
    //1 4 6 4 1
    //1 * (4/1) * (4*3/1*2) * (4*3*2/1*2*3) *(4*3*2*1/1*2*3*4)
//    1 *4/1    *3/2        *2/3            *(1/4)

    public static List<Integer> secondType(int n) {
        List<Integer> answers = new ArrayList<>();
        answers.add(1);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            answers.add(ans);
        }
        return answers;
    }

    public static List<List<Integer>> thirdType(int n){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(secondType(i));
        }
        return list;
    }
}
