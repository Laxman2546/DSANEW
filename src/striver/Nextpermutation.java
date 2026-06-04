package striver;

import java.util.Arrays;

public class Nextpermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        next(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void next(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] > nums[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx == -1){
           reverseArr(0,n-1,nums);
        }else{
            for(int i=n-1;i>=0;i--){
                if(nums[i] > nums[idx]) {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                }
            }
            reverseArr(idx+1,n-1,nums);
        }
    }
    private static void swap(int st, int end) {

    }
    private static void reverseArr(int st, int end,int[] nums) {
        while(st < end){
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
        st++;
        end--;
        }
    }
}
