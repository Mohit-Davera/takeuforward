package array.hard.old;

import java.util.ArrayList;

public class MajorityByThree {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(logic(nums));
    }

    public static ArrayList<Integer> logic(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int majorityOne = Integer.MIN_VALUE;
        int majorityTwo = majorityOne;
        int countOne = 0;
        int countTwo = countOne;

        for (int i :
                arr) {
            if(i == majorityOne){
                countOne++;
            } else if (i == majorityTwo) {
                countTwo++;
            } else if (countOne == 0) {
                countOne = 1;
                majorityOne = i;
            } else if (countTwo == 0) {
                countTwo = 1;
                majorityTwo = i;
            }
            else{
                countOne--;
                countTwo--;
            }
        }
        countOne = 0;
        countTwo = 0;
        for (int i : arr) {
            if(i == majorityOne){
                countOne++;
            }
            if (i == majorityTwo) {
                countTwo++;
            }
        }
        int n = arr.length;
        if(countOne > n/3){
            arrayList.add(majorityOne);
        }
        if(countTwo > n/3){
            arrayList.add(majorityTwo);
        }
        if(arrayList.size() == 0){
            arrayList.add(-1);
        }
        return arrayList;
    }
}
