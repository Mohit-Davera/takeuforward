package heap.heap_aditya;

import java.util.*;

public class TopKWord {

    public static void main(String[] args) {
        topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2);
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        Queue<String> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(String w: words){
            map.merge(w,1,Integer::sum);
        }

        for(String w: words){
            if(!pq.contains(w))
                pq.add(w);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return new ArrayList<>(pq);
    }
}
