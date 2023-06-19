package patterns;

public class Pattern18 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 6;
        char initial = (char)(65 + size - 1);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)(initial+j) + " ");
            }
            System.out.println();
            initial = (char) (initial - 1);
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