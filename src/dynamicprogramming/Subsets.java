package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> ls = new ArrayList<>();
        sub(nums,0,ls);
    }

    private static void sub(int[] nums, int i,List<Integer> ls) {
        if(i == nums.length){
            System.out.println(ls);
            return;
        }
        ls.add(nums[i]);
        sub(nums,i+1,ls);
        ls.removeLast();
        sub(nums,i+1,ls);
    }
}
