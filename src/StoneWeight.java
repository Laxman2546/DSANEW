import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class StoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.add(stone);
        }
        while(!maxHeap.isEmpty()&&maxHeap.size()>1){
            try{
                int first =  maxHeap.poll();
                int second = maxHeap.poll();
                if(first != second){
                    int number = first - second;
                    maxHeap.add(number);
                }
            }catch (NullPointerException e){
                System.out.println(e);
            }

        }
        return !maxHeap.isEmpty()? maxHeap.peek() : 0;
    }
    public static void main() {
        int stones[] = {1,3};
        int res = lastStoneWeight(stones);
        System.out.println(res+"iam output");
    }
}
