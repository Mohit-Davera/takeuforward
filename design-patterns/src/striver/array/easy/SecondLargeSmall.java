package striver.array.easy;

public class SecondLargeSmall {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for(int i : arr){
            if (i < min )
            {
                sMin = min;
                min = i;
            } else if (i<sMin && i != min) {
                sMin = i;
            }


            if (i > max )
            {
                sMax = max;
                max = i;
            } else if (i>sMax && i != max) {
                sMax = i;
            }
        }

        System.out.println();
    }
}
