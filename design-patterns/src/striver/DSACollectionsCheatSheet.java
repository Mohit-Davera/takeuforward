package striver;

public class DSACollectionsCheatSheet {

    // 1. 1D Array
    int[] arr = new int[5];
    int[] arr2 = {1, 2, 3};

    // 2. 2D Array
    int[][] grid = new int[3][4];
    int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
    };

    // 3. ArrayList
    java.util.List<Integer> arrayList = new java.util.ArrayList<>();

    // 4. LinkedList
    java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();

    // 5. HashMap
    java.util.Map<String, Integer> hashMap = new java.util.HashMap<>();

    // 6. TreeMap
    java.util.TreeMap<Integer, Integer> treeMap = new java.util.TreeMap<>();

    // 7. HashSet
    java.util.Set<Integer> hashSet = new java.util.HashSet<>();

    // 8. TreeSet
    java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();

    // 9. PriorityQueue (Min-Heap & Max-Heap)
    java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();
    java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());

    // 10. Deque (ArrayDeque)
    java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();

    // 11. Queue
    java.util.Queue<Integer> queue = new java.util.LinkedList<>();

    // 12. Stack
    java.util.Stack<Integer> stack = new java.util.Stack<>();

    // 13. Pair Class
    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 14. Graph Representations
    int n = 5;
    java.util.List<java.util.List<Integer>> graphList = new java.util.ArrayList<>();
    java.util.Map<Integer, java.util.List<Integer>> graphMap = new java.util.HashMap<>();

    public DSACollectionsCheatSheet() {

        // ArrayList usage
        arrayList.add(10);
        int a = arrayList.get(0);

        // LinkedList usage
        linkedList.addFirst(1);
        linkedList.addLast(2);

        // HashMap usage
        hashMap.put("a", 1);
        int val = hashMap.getOrDefault("b", 0);

        // TreeMap usage
        treeMap.put(5, 100);
        Integer floor = treeMap.floorKey(4);

        // HashSet usage
        hashSet.add(7);
        boolean exists = hashSet.contains(7);

        // TreeSet usage
        treeSet.add(10);
        Integer ceil = treeSet.ceiling(8);

        // PriorityQueue usage
        minHeap.offer(5);
        int topMin = minHeap.poll();
        maxHeap.offer(5);
        int topMax = maxHeap.poll();

        // Deque usage
        deque.addFirst(1);
        deque.addLast(2);
        deque.pollFirst();

        // Queue usage
        queue.offer(1);
        int qVal = queue.poll();

        // Stack usage
        stack.push(3);
        int sVal = stack.pop();

        // 2D array usage
        int x = grid[1][2];

        // Graph (Adjacency List)
        for (int i = 0; i < n; i++) graphList.add(new java.util.ArrayList<>());
        graphList.get(0).add(1);

        // Graph (Adjacency Map)
        graphMap.computeIfAbsent(1, k -> new java.util.ArrayList<>()).add(2);
    }

    public static void main(String[] args) {
        new DSACollectionsCheatSheet();
    }
}