package patterns;

public class Pattern10_1 {

    public static void main(String[] args) {
//        int size = Integer.parseInt(args[0]);
        int size = 5;
        int stars;
        for (int i = 0; i < 2 * size - 1; i++) {
            stars = i;
            if (i >= size)
                stars = 2 * size - i - 2;
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
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