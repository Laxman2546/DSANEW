import java.util.Collections;
import java.util.PriorityQueue;

public class TargetArraay {
    public static  boolean isPossible(int[] target){
        PriorityQueue<Long> hp = new PriorityQueue<>(Collections.reverseOrder());
        if(target.length == 1){
            return target[0] == 1;
        }
        long sum = 0;
        for(int value : target){
            hp.offer((long)value);
            sum+= value;
        }
        while(!hp.isEmpty() &&hp.peek() > 1 ){
            long largest = hp.peek();hp.poll();
            long restSum = sum - largest;
            if(restSum == 0 || largest - restSum < 1){
                return false;
            }
            long previous = largest % restSum;
            if(previous == 0){
                previous = restSum;
            }
            hp.offer(previous);
            sum = sum - largest + previous;

        }
        return true;
    }
    public static void main(String[] args) {
        int[] target = {1,1,1,2};
        boolean check = isPossible(target);
        System.out.println(check);
    }
}
