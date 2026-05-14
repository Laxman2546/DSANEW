import java.util.HashMap;

public class GoodArray {

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }
    public static boolean isGood(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           max = Math.max(nums[i],max);
            hm.put(nums[i],hm.getOrDefault(nums[i],0) + 1);
        }
        if(nums.length < max+1){
            return false;
        }
        for(int num: nums){
            int val = hm.get(num);
            if(num!=max && val > 1 || num== max && val < 2){
                return false;
            }
        }
        return true;
    }
}
