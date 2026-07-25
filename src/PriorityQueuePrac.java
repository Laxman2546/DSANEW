import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePrac {
    public static void main(String[] args) {
        int[] arr = {5,8,9,6,4,2,1};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = 5;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
