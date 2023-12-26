package reading_try;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1,3,2,4));
        Integer[] ints = new Integer[integers.size()];
        integers.toArray(ints);
        integers.remove((Integer) 3);
        System.out.println(integers);
    }
}
