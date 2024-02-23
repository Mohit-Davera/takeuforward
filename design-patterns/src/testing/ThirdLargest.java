package testing;

//zero space and sorting
public class ThirdLargest {

    public static void main(String[] args) {
        int[] nums = {6,5,3,4,4,3,3,10,7,8,9};

        thirdLargest(nums);
    }

    public static void secondLargest(int[] nums){
        int max = 0;
        int smax = 0;

        for(int i : nums){
            if(max < i){
                smax = max;
                max = i;
            } else if (max != i && smax < i) {
                smax = i;
            }
        }

        System.out.println("MAX " + max + " Second Largest " + smax);
    }

    public static void thirdLargest(int[] nums){
        int first = -1;
        int second = -1;
        int third = -1;

        for(int i : nums){
            if(first < i){
                third = second;
                second = first;
                first = i;
            }
            else if(first != i && second < i){
                third = second;
                second = i;
            }
            else{
                third = Math.max(i,third);
            }
        }

        System.out.println("Largest " + first + " Second Largest " + second + " Third Largest " + third);

    }
}
