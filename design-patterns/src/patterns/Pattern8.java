package patterns;

public class Pattern8 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 5;
        int border = 2 * size - 1;
        int half = (int)border/2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < border; j++) {
                if (j>=i && j<border-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
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