package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class BallonsBurst {
    public static void main(String[] args) {
        int[][] points = new int[][]{{-2147483646,-2147483645},{2147483646,2147483647}};
//        int[][] points = new int[][]{{-2,-1},{1,2}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(ints -> ints[1]));

        int count = 1;

        int s = points[0][0];
        int f = points[0][1];

        for(int i = 1; i<points.length;i++){
            if(points[i][0] <= f){
                continue;
            }
            else{
                count++;
                s = points[i][0];
                f = points[i][1];
            }
        }

        return count;
    }
}
