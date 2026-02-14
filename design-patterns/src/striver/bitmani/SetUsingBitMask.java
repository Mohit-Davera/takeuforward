package striver.bitmani;

public class SetUsingBitMask {

    long mask;

    void add(int x){
        mask = mask | (1L<<x);
    }

    void remove(int x){
        mask = mask & ~(1L<<x);
    }

    void printAll(){
        for(int bit = 1;bit<=60;bit++){
            if((mask & 1L<<bit) >0){
                System.out.print(bit + " ");
            }
        }
        System.out.println();
    }
}
