package striver.patterns;

public class Pattern10 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size - i -1; j++) {
                System.out.print("*");
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