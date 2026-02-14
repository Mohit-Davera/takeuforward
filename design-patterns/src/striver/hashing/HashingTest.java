package striver.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingTest {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        int[] arr = {1, 2, 3, 1, 12, 12, 2, 3, 5,12};
        int lowEle = arr[0];
        int lowCount = 100000;
        int highEle = arr[0];
        int highCount = 1;
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)<=lowCount){
                lowEle = i;
                lowCount = map.get(i);
            }
            if(map.get(i)>=highCount){
                highEle = i;
                highCount = map.get(i);
            }
        }

        for (Map.Entry<Integer,Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        System.out.println("low high " + lowEle + " " + highEle);
    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setData("Pankaj");
        System.out.println(dk.hashCode());

        hm.put(dk, 10);

        return hm;
    }

}