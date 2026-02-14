package striver.patterns;

public class Pattern_Test {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
/*
 * 0     5
 * 1    456
 * 2   34567
 * 3  2345678
 * 4 123456789
 * 5
 *
 * 0
 * 1
 * 2
 * 3
 * 4
 * */