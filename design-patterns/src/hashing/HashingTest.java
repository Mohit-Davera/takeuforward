package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingTest {

    public static void main(String[] args) {
        //Map<DataKey, Integer> hm = getAllData();

/*        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setData("Pankaj");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);

        System.out.println(value);*/

        System.out.println("Mohit".hashCode());
        System.out.println("Mohit".hashCode());
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