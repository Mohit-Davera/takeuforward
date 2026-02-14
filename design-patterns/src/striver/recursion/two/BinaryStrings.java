package striver.recursion.two;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {

    public static void main(String[] args) {
        List<String> strings = generateString(3);
        System.out.println(strings);
    }

    public static List<String> generateString(int n) {
        List<String> strings = new ArrayList<>();
        recursion(strings, n, "");
        return strings;
    }

    public static void recursion(List<String> strings, int n, String curr) {
        if (curr.length() == n) {
            strings.add(curr);
            return;
        }

        recursion(strings, n, curr + "0");
        if (curr.equals("") || curr.charAt(curr.length() - 1) != '1')
            recursion(strings, n, curr + "1");
    }
}
