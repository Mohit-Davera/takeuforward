package striver.array.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {
    static void bruteLogic(int[] arr, int k){
        for(int i = 0; i< arr.length - k +1;i++){
            boolean foundNegative = false;
            for (int j = i; j < i+k; j++) {
                if(arr[j] < 0 ){
                    foundNegative = true;
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
            if(!foundNegative){
                System.out.println("0 ");
            }
        }
    }

    static void slidingWindowWithQueue(int[] arr,int k){
        int start = 0;
        int end = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (end<arr.length){
            if(arr[end] < 0){
                queue.add(arr[end]);
            }
            if(end-start+1==k)
            {
                if(queue.isEmpty()){
                    System.out.print("0 ");
                }
                else {
                    Integer remove = queue.peek();
                    System.out.print(remove+" ");
                    if(arr[start] == remove){
                        queue.remove();
                    }
                }
                start++;
            }
            end++;
        }
    }

    public static void main(String[] args) {
        int[] ints = {12, -1, -7, 8, -16, 30, 16, 28};
        slidingWindowWithQueue(ints,3);
    }
}
