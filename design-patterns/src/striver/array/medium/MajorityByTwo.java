package striver.array.medium;

public class MajorityByTwo {
    public static int logicGFG(int[] a,int size){
        int count = 0;
        int candidate = 0;
        for(int i:a){
            if(count == 0){
                candidate = i;
            }
            if(i == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int i : a){
            if(candidate == i)
                count++;
        }
        if(count > size/2)
            return candidate;
        return -1;
    }

    public int logicGFG(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i:nums){
            if(count == 0){
                candidate = i;
            }
            if(i == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {

    }
}
