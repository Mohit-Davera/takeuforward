package striver.patterns;

public class Pattern14 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 5;
        char initial = 'A';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(initial);
            }
            initial++;
            System.out.println();
        }
    }
}
/*
 * 0    5
 * 1   456
 * 2  34567
 * 3 2345678
 * 4123456789
 * 5
 * */