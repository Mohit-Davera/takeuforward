package bitmani;

public class IntroToBit {
    public static void main(String[] args) {
        int num = 25;
        //11001;
        int i = unsetLastSetBit(24);
        System.out.println(i);

    }

    public static int countSetBit(int x) {
        int count = 0;
        while (x != 0) {
            if ((x & 1) == 1) {
                count++;
            }
            x = x >> 1;
        }
        return count;
    }

    public static int iThBit(int x, int k) {
        k = 1 << (k-1);

        return ((x & k) >= 1)?1:0;
    }

    public static int unsetLastSetBit(int x) {
        if(x == 0 ) return 0;
        int count = 1;
        int mask = 1;
        while(true){
            if( (x & mask) == 1) break;
            mask = mask << 1;
            count++;
        }

        x = x & ~(mask);
        return x;
    }


}
