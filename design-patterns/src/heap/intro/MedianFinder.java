package heap.intro;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> first;
    PriorityQueue<Integer> second;

    private static boolean isEven = true;
    public MedianFinder() {
        first = new PriorityQueue<>(Collections.reverseOrder());
        second = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(isEven){
            if(!second.isEmpty()){
                first.add(second.poll());
                second.add(num);
            }
            else
                first.add(num);
        }
        else{
            second.add(num);
        }
        isEven=!isEven;
    }

    public double findMedian() {
        if(isEven){
            return (first.peek() + second.peek())/2.0;
        }
        return first.peek();
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
    }
}
