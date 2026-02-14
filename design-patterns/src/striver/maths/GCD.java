package striver.maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(logic(20,15));
    }

    public static int logic(int n1,int n2){
        int range = Math.min(n1,n2);

        int maxGCD = 1;
        for(int i = 2;i<range;i++){
            if(n1 % i == 0 && n2 % i == 0){
                maxGCD = i;
            }
        }

        return maxGCD;
    }
}
