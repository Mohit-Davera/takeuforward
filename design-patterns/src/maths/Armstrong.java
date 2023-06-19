package maths;

public class Armstrong {
    public static void main(String[] args) {
        int n =370;
        int temp = n;
        int arm = 0;
        while (n!=0){
            arm = arm + (n%10)*(n%10)*(n%10);
            n=n/10;
        }
        System.out.println(arm);
        System.out.println(arm == temp);
    }
}
