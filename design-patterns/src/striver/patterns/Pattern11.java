package striver.patterns;

public class Pattern11 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 6;
        int c = 0;
        for (int i = 0; i < size; i++) {
            if(i%2 == 0)
                c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = 1 - c;
            }
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