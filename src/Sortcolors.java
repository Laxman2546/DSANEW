import java.util.Arrays;

public class Sortcolors {
    public static void swap( int[] nums, int num1,int num2){
            nums[num1] = nums[num1] ^ nums[num2];
            nums[num2] =  nums[num1] ^ nums[num2];
            nums[num1] = nums[num1] ^ nums[num2];
    }
    public static void sortColors(int[] nums){
        int ptr2 = nums.length-1;
        int ptr3 = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[ptr2] && nums[i] >nums[ptr3]){
                    swap(nums,i,ptr2);
                    ptr2--;
            }else if(nums[i] > nums[ptr2] && nums[i]  <nums[ptr3]){
                    swap(nums,i,ptr3);
            }
        }
    }
    public static void main(String[] args) {
            int[] colors = {2,0,2,1,1,0};
            sortColors(colors);
            System.out.println(Arrays.toString(colors));

    }

}
