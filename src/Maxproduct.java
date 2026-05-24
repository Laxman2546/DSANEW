import java.util.Arrays;

public class Maxproduct {
    public static  int maxProduct(int[] nums) {
        int fMax = 0;
        int sMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > fMax){
                sMax = fMax;
                fMax = nums[i];
            }
            else if(nums[i] > sMax){
                sMax = nums[i];
            }
        }
        int mul =  (fMax - 1) * (sMax - 1);
        return mul;
//        Arrays.sort(nums);
//        int last = nums[nums.length - 1] - 1;
//        int sec = nums[nums.length - 2]- 1;
//        return last * sec;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
}
