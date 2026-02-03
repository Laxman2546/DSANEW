import java.util.*;
public class DuplicateTwo {
    public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int key = hm.get(nums[i]);
                if(i - key <= k){
                    return true;
                }
            }
            hm.put(nums[i],i);

        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k= 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
