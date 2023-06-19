package maths;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1456;
        int revN = 0;
        int digit = 0;
        while(n!=0){
            digit = n% 10;
            revN = revN*10 + digit;
            n = n /10;
        }
        System.out.println(revN);
    }
}
