import java.util.*;

public class TopkFrequent {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int l = 0;
        HashMap<Integer,Integer> hm = new HashMap();
       for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
       }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(a) - hm.get(b));
       for(int key : hm.keySet()){
           pq.add(key);
           if(pq.size()>k){
               pq.poll();
           }
       }
        int[] newArr = new int[k];
//       for(int i=0;i<k;i++){
//           newArr[i] = pq.poll();
//       }
       List<Integer> ls = new ArrayList<>();
       while(!pq.isEmpty()){
           ls.add(pq.poll());
       }
        System.out.println(ls + "iam ls");
        return newArr;
    }


}
