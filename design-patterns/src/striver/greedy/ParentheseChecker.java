package striver.greedy;

public class ParentheseChecker {
    public static void main(String[] args) {

    }

    public static boolean check(String s){

        //maximum open bracket needs to be balanced
        int maxOpen = 0;
        //minimum open bracket needs to be balanced
        int minOpen = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                maxOpen++;
                minOpen++;
            }
            else if(c == ')'){
                minOpen = Math.max(0,minOpen - 1);
                maxOpen--;
            }
            else{
                //We decrease minOpen because '*' can act as a closing parenthesis.
                //We increase maxOpen because '*' can act as an opening parenthesis.
                minOpen = Math.max(0,minOpen - 1);
                maxOpen++;
            }

            if(maxOpen < 0) return false;
        }

        return minOpen == 0;
    }
}
