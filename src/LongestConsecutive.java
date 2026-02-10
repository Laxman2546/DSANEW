import java.util.HashSet;

public class LongestConsecutive {
    public static int  longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int num : nums){
            hs.add(num);
        }
       for(int num : nums){
           if(hs.contains(num) && !hs.contains(num-1)){
               int curr = num;
               int cnt = 0;
               while(hs.contains(curr)){
                   hs.remove(curr);
                   curr++;
                   cnt++;
               }
               count=Math.max(count,cnt);
           }
       }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}
