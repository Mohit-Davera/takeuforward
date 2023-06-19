package array.old.easy;

public class MaxOnesIn2DMatrix {
    static int logic(int[][] mat, int n, int m) {
        int len = n*m;
        int max = 0;
        int row = -1;
        int localCount = 0;
        for (int i = 0; i < len;i++){
            if(i%m==0){
                if(max<localCount){
                    max = localCount;
                    row = (i-1)/(m);
                }
                localCount = 0;
            }
            if(mat[i/m][i%m] == 1) {
                localCount++;
            }
        }
        if(max<localCount){
            row = (n*m-1)/(m);
        }
        return row;
    }

    public static void main(String[] args) {
/*        int N = 4, M = 4;
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};*/
/*        int N = 5, M = 3;
        int[][] arr = {{0,0,1},{0,0,1},{0,0,1},{0,1,1},{1,1,1}};*/
        int logic = logic(new int[][]{{0,0},{0,0}},2,2);
        System.out.println(logic);
    }
}
