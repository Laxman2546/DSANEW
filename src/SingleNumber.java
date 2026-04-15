public class SingleNumber {
    public  static int singleNum(int[] nums){
        int num = 0;
        for(int i=0;i<nums.length;i++){
            num ^= nums[i];
        }
        return  num;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(singleNum(nums));
    }
}
