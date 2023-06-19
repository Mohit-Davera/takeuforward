package patterns;

public class Pattern13 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 4;
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
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