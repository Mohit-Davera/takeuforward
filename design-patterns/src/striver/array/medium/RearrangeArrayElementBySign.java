package striver.array.medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1,3,4,5,6 -2, -5, 2, -4,1,1,1,1};
        int[] negatives = {-36 ,-9 ,-92 ,-87 ,-43 ,-44};
        int[] logic = gfg(negatives,negatives.length);
        for (int i :
                logic) {
            System.out.print(i +" " );
        }

    }

    //if length is equal
    public static int[] leetcode(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int positiveCount = 0;
        int negativeCount = 1;
        for (int num : arr) {
            if (num > 0) {
                temp[positiveCount] = num;
                positiveCount += 2;
            } else {
                temp[negativeCount] = num;
                negativeCount += 2;
            }
        }
        return temp;
    }


    public static int[] gfg(int[] arr,int n){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i :
                arr) {
            if(i>=0){
                pos.add(i);
            }
            else{
                neg.add(i);
            }
        }
        int i = 0; int j=0; int k=0;
        while (i< pos.size() && j<neg.size()){
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }
        while (i< pos.size())
            arr[k++] = pos.get(i++);
        while (j< neg.size())
            arr[k++] = neg.get(j++);

        return arr;
    }
}
