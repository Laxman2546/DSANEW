import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] arr = separateDigits(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static  int[] separateDigits(int[] nums) {
        List<Integer> ls = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 9){
                char[] dig = String.valueOf(nums[i]).toCharArray();
                for(int k= 0;k<dig.length;k++){
                    int num = dig[k] - '0';
                    ls.add(num);
                }
            }else{
                ls.add(nums[i]);
            }
        }
        int[] arr = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]  = ls.get(i);
        }
        return arr;
    }
}
