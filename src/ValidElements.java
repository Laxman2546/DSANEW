import java.util.ArrayList;
import java.util.List;
//class Solution {
//    public List<Integer> findValidElements(int[] nums) {
//        int n = nums.length;
//        List<Integer> result = new ArrayList<>();
//        if (n == 0) return result;
//        if (n == 1) {
//            result.add(nums[0]);
//            return result;
//        }
//
//        boolean[] isValid = new boolean[n];
//
//        // First and last are always valid
//        isValid[0] = true;
//        isValid[n - 1] = true;
//
//        // Check: strictly greater than every element to its left
//        int leftMax = nums[0];
//        for (int i = 1; i < n - 1; i++) {
//            if (nums[i] > leftMax) {
//                isValid[i] = true;
//            }
//            leftMax = Math.max(leftMax, nums[i]);
//        }
//
//        // Check: strictly greater than every element to its right
//        int rightMax = nums[n - 1];
//        for (int i = n - 2; i > 0; i--) {
//            if (nums[i] > rightMax) {
//                isValid[i] = true;
//            }
//            rightMax = Math.max(rightMax, nums[i]);
//        }
//
//        // Collect results in original order
//        for (int i = 0; i < n; i++) {
//            if (isValid[i]) {
//                result.add(nums[i]);
//            }
//        }
//
//        return result;
//    }
//}
public class ValidElements {
    public static void main(String[] args) {
        int[] nums  = {5,5,5,5};
        System.out.println(findValidElements(nums));
    }
    public static List<Integer> findValidElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]||nums[i] >nums[i+1]){
                ls.add(nums[i]);
            }
        }
        ls.add(nums[nums.length-1]);
        return ls;
    }
}
