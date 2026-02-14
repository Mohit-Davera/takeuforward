package striver.array.hard.old;

import java.util.HashMap;

public class CountSubArrayXorK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int subsetXOR = subsetXOR(arr, arr.length, k);
        System.out.println(subsetXOR);
    }

    static int subsetXOR(int[] arr, int N, int K) {
        int cnt = 0;
        int xorr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            xorr ^= arr[i];
            if (map.get(xorr ^ K) != null)
                cnt = cnt + map.get(xorr ^ K);
            if (xorr == K) {
                cnt++;
            }
            if(map.get(xorr) != null){
                map.put(xorr,map.get(xorr)+1);
            }else{
                map.put(xorr,1);
            }
            //map.merge(xorr, 1, Integer::sum);
        }
        return cnt;
    }
}
