package interview;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 6, 10, 15, 20};
        Map<Integer, Integer> map = countOcc(arr);
//        System.out.println(map);

        int i = secondHighest(arr);
        System.out.println(i);



    }

    public static Map<Integer,Integer> countOcc(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
//            map.merge(i,1,Integer::sum);
        }

        return map;
    }

    public static int secondHighest(int[] arr){
        int max = arr[0];
        int smax = arr[1];

        for(int i : arr){
            if(i>max){
                smax = max;
                max = i;
            }
            else if(i >smax && max != i){
                smax = i;
            }
        }

        return smax;
    }
}
