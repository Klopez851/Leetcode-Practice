package TopKElement;

import java.util.PriorityQueue;

public class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        if(minHeap.size() < k){
            minHeap.offer(k);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.add(val);
        }

        return minHeap.peek();

    }

}
