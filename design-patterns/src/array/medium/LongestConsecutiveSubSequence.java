package array.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {
    public static int logic(int[] arr){
        int maxSeq = 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i :
                arr) {
            set.add(i);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                count = 1;
                int currentNum = num;
                while (set.contains(currentNum + 1)){
                    count++;
                    currentNum++;
                }
                maxSeq = Math.max(maxSeq,count);
            }
        }
        return maxSeq;
    }

    int findLongestConseqSubseq(int arr[], int N)
    {
        int[] temp = new int[100001];
        int maxIndex=0;
        for(int i=0;i<N;i++){
            temp[arr[i]]=1;
            maxIndex=Math.max(maxIndex, arr[i]);
        }
        int maxCount=0; int count=0;
        for(int i=1;i<=maxIndex;i++){
            if(temp[i] == 1)
                count++;
            else
                count=0;
            maxCount=Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        /*int[] arr = {2,6,1,9,4,5,3};
        int logic = logic(arr);
        System.out.println(logic);*/
    }
}
