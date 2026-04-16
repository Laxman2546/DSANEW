public class Jumpgame {
    public static  boolean canJump(int[] nums){
        // write your code here
        int maxIdx = 0;
        for(int i=0;i<nums.length;i++){
          if(i > maxIdx) return false;
          maxIdx = Math.max(maxIdx, i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
         int[] arr = {6,0,8,9,1,0,6,10,9,2,5,5,3,0,8,8,5,3,0,0};
        System.out.println(canJump(arr));
    }

}
