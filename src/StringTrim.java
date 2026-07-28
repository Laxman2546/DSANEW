import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
class Pairs{
    int value;
    int idx;
    public Pairs(int value,int idx){
            this.value = value;
            this.idx= idx;
    }
}

public class StringTrim {
    public static void main(String[] args) {
        String[] nums = {"102","473","251","814"};
        int[][] queries = {{1,1},{2,3},{4,2},{1,2}};
        System.out.println(Arrays.toString(trim(nums,queries)));
    }
    private static int[] trim(String[] nums, int[][] queries) {
        int[] res = new int [queries.length];
        int k = 0;
        for(int i=0;i<queries.length;i++){
                String[] digits = new String[nums.length];
                int kthsmallest = queries[i][0];
                int trimCount  = queries[i][1];
                for(int j=0;j<nums.length;j++){
                    digits[j] = nums[j].substring(nums[j].length()-trimCount);
                }
                    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                    HashMap<Integer,Integer> hm = new HashMap<>();
                    for(int l=0;l<digits.length;l++){
                     pq.add(Integer.parseInt(digits[l]));
                     hm.put(Integer.parseInt(digits[l]),l);
                    if(pq.size() > kthsmallest){
                        pq.poll();
                    }
                    }
                    res[k++] = pq.peek() != null ? hm.get(pq.peek()) : 0;
            System.out.println(Arrays.toString(digits));
        }
        return res;
    }
}
