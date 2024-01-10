package testing;

public class TextJustification {
    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{2,4,8,2},4,2));
    }

    public static boolean isPossible(int[] nums,int op,int max){
        int currOp = 0;

        for(int i : nums){
            if(i>max){
                currOp += Math.ceil(i / (float)max);
            }
        }
        return currOp<=op;
    }

}