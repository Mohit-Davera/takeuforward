package patterns;

public class Pattern12 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 4;
        int space = 2 * (size - 1);
        int c = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < space - 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i+1-j);
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