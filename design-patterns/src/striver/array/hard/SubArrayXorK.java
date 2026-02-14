package striver.array.hard;

import java.util.HashMap;

public class SubArrayXorK {
    public static void main(String[] args) {
        System.out.println(logic(new int[]{4 ,94, 39, 36, 88, 87, 39, 67, 11, 6},15));
    }

    public static int logic(int[] arr,int k){
        int xr = 0;
        int count = 0;
        HashMap<Integer,Integer> preXorMap = new HashMap<>();
        preXorMap.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            count += preXorMap.getOrDefault(xr^k,0);
            preXorMap.merge(xr,1,Integer::sum);
        }
        return count;
    }
}
