package string_;

public class KMP {

    public static void main(String[] args) {
//        int[] ints = prepareLPS("ABABDABACDABABCAB");
//        firstOccurrence("abcaby","abxabcabcaby");

        int[] ints1 = prepareLPS("abdbd");


    }

    public static void firstOccurrence(String needle,String hay){
        int[] lps = prepareLPS(needle);


        int n = 0;
        int h = 0;

        while(h < hay.length()){
            if(needle.charAt(n) == hay.charAt(h)){
                n++;
                h++;
            }
            if (n == needle.length()) {
                System.out.println("Found needle:  " + needle +
                        " at index " + (h - n) + " " + hay.substring(h-n,h));
                n = lps[n - 1];
            } else if (h < hay.length() && needle.charAt(n) != hay.charAt(h)) {
                if (n != 0)
                    n = lps[n - 1];
                else
                    h = h + 1;
            }
        }
    }

    public static int[] prepareLPS(String pattern){
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while(i<n){
            if(pattern.charAt(len) == pattern.charAt(i)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                    len = lps[len - 1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
