package striver.array.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityNByThree {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{1,2,2,3,2}));
    }

    public static List<Integer> logic(int[] arr){
        int countOne = 0;
        int countTwo = 0;
        int elementOne = 0;
        int elementTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if(countOne == 0 && arr[i] != elementTwo)
            {
                countOne++;
                elementOne = arr[i];
            }
            else if(countTwo == 0 && arr[i] != elementOne)
            {
                countTwo++;
                elementTwo = arr[i];
            } else if (countOne == arr[i]) {
                countOne++;
            } else if (countTwo == arr[i]) {
                countTwo++;
            }else{
                countOne--;
                countTwo--;
            }
        }

        int majorCount = (int)Math.floor(arr.length/3.0) + 1;
        countOne = countTwo = 0;
        for (int i :
                arr) {
            if(i == elementOne)
                countOne++;
            if(i == elementTwo)
                countTwo++;
        }
        List<Integer> answers = new ArrayList<>();
        if(countOne >= majorCount)
            answers.add(elementOne);
        if(countTwo >= majorCount)
            answers.add(elementTwo);
        Collections.sort(answers);
        return answers;
    }
}
