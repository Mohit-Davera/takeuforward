package patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        int border = 2 * n - 1;
        for (int i = 0; i < border; i++) {
            for (int j = 0; j < border; j++) {
                System.out.print(Math.abs(4-Math.min(i,Math.min(border-j-1,Math.min(border-i-1,j)))));
            }
            System.out.println();
        }
    }
}
