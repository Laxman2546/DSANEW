public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {0,5,4,3,1,2};
        int ans = findMissing(nums);
        System.out.println(ans);
    }

    private static int findMissing(int[] nums) {
        int i = 0;
        while (i != nums.length){
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }

}
