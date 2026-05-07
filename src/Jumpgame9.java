import java.util.Arrays;

public class Jumpgame9 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
       int[] res=   jumpMeth(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] jumpMeth(int[] nums) {
        int n = nums.length;
        int sufmin = Integer.MAX_VALUE;
        int[] res  = new int[n];
        int[] premax = new int[n];
        premax[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            premax[i] = Math.max(nums[i],premax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            sufmin = Math.min(nums[i+1],sufmin);
            if(sufmin < premax[i]){
                    premax[i] = premax[i+1];
            }
        }
        return premax;
    }
}
