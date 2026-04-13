import java.util.Arrays;

public class Sortcolors {
    public static void swap( int[] nums, int num1,int num2){
            if(num1 == num2) return;
            nums[num1] = nums[num1] ^ nums[num2];
            nums[num2] =  nums[num1] ^ nums[num2];
            nums[num1] = nums[num1] ^ nums[num2];
    }
    public static void sortColors(int[] nums){
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums,left,mid);
                mid++;
                left++;
            }else if(nums[mid] == 2){
                swap(nums,mid,right);
                right--;
            }else{
                mid++;
            }
        }
    }
    public static void main(String[] args) {
            int[] colors = {0,2,2,2,2,1,0,1,0,0,0,1,0,2,0};
            sortColors(colors);
            System.out.println(Arrays.toString(colors));

    }

}
