package patterns;

public class Pattern19 {

    public static void main(String[] args) {
        int size = 3;
        int starCondition;
        int spaceCondition = 0;
        for (int i = 0; i < 2 * size; i++) {
            if (i >= size) {
                starCondition = i - size + 1;
                spaceCondition = ((2 * size) - 2) - (2 * (i - size));
            } else {
                starCondition = size - i;
                spaceCondition = 2 * i;
            }
            for (int j = 0; j < starCondition; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCondition; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCondition; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
0 0
1 2
2 4
3 6
4 8

5 8 8 - 2(0)
6 6 8 - 2(1)
7 4 8 - 2(2)
8 2 8 - 2(3)
9 0 8 - 2(4)
* */