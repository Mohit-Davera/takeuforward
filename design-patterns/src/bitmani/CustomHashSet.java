package bitmani;

public class CustomHashSet {

    long number = 0;

    int add(int i){
        number = (number | (1L <<i));
        return i;
    }

    boolean remove(int i){
        number = number & ~(1L<<i);
        return true;
    }

    boolean checkIfExists(int i){
        return (number & 1L << i) == 1;
    }

    public void print(){
        for(int i=0;i<60;i++){
            if((number & (1L << i)) >= 1)
                System.out.print(" " + i);
        }
    }


    public static void main(String[] args) {
        CustomHashSet customHashSet = new CustomHashSet();

        customHashSet.add(1);
        customHashSet.add(5);

        customHashSet.add(8);

        customHashSet.add(10);
        customHashSet.print();
        System.out.println();
        customHashSet.remove(2);
        customHashSet.remove(8);
        customHashSet.print();
    }
}
