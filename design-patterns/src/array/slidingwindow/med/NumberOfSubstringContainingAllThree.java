package array.slidingwindow.med;

public class NumberOfSubstringContainingAllThree {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("aaaaabca"));
    }

    /*
        just use this example

        aaaaabc
        0123456

        l1 = 4
        l2 = 5
        l3 = 6 so
        min = 4 so subarray will be 5.
        aaaaabc
         aaaabc
          aaabc
           aabc
            abc
    */
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int l1 = -1;
        int l2 = -1;
        int l3 = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') l1 = i;
            else if (s.charAt(i) == 'b') l2 = i;
            else l3 = i;
            if (l1 == -1 || l2 == -1 || l3 == -1) continue;
            int min = Math.min(l1, Math.min(l2, l3));
            count += min + 1;
        }
        return count;
    }
}
