package striver.patterns;

public class Pattern20 {

    public static void main(String[] args) {
        int size = 6;
        int starCondition;
        int spaceCondition = (2 * size);
        for (int i = 0; i < 2 * size - 1; i++) {
            starCondition = i;
            if (i > size - 1) {
                starCondition = 2 * size - i -2;
                spaceCondition += 2;
            } else {
                spaceCondition -= 2;
            }
            for (int j = 0; j <= starCondition; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCondition; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= starCondition; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/*
0 8
1 6
2 4
3 2
4 0
5 0
6 2


* */