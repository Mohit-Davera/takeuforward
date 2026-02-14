package striver.patterns;

public class Pattern17 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 4    ;
        int border = 2 * size - 1;
        int half = (int)border/2;
        for (int i = 0; i < size; i++) {
            char initial = 'A';
            for (int j = 0; j < border; j++) {
                if (j>=half - i && j<=half + i) {
                    System.out.print(initial);
                    initial = (char) (j>=4? initial-1: initial+1);
                }
                else {
                    System.out.print(" ");
                }
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