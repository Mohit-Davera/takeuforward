package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OuterClass {
    public static void main(String[] args) {
/*        List<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("GHI");
        strings.add("DEF");

        String[] strings1 = {"AA","BB","CC"};

        ArrayList<String> collect = Arrays.stream(strings1).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);

        String[] strings2 = strings.toArray(String[]::new);*/
        List<Integer> integers = new ArrayList<>();
        integers.add(1000);
        integers.add(2000);
        integers.add(3000);

        int[] ints = new int[]{1,2,3,4,5,6};

        ArrayList<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toCollection(ArrayList::new));
        int[] ints1 = integers.stream().mapToInt(Integer::intValue).toArray();
        integers.stream().toArray(i -> collect.toArray(new Integer[0]));
        System.out.println();

    }
}
