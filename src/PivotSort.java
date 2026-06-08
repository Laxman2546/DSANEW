import java.util.ArrayList;
import java.util.List;

public class PivotSort {
    public static void main(String[] args) {
        int[] nums = {-3,2,5,8,4,3,1};
        int pivot = 5;
        pivotArray(nums,pivot);
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        if(nums.length == 1)return new int[]{nums[0]};
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i=0 ;i<nums.length;i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }else if(nums[i]  == pivot){
                mid.add(nums[i]);
            }else{
                right.add(nums[i]);
            }
        }
        int k = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<left.size();i++){
            res[k++] = left.get(i);
        }
        for(int i=0;i<mid.size();i++){
            res[k++] = mid.get(i);
        }
        for(int i=0;i<right.size();i++){
            res[k++] = right.get(i);
        }
        return res;
    }
}

