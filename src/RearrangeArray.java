import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    private static int[] rearrangeArray(int[] nums) {
       int[] rearr = new int[nums.length];
       int pos = 0;
       int neg = 1;
       for(int num:nums){
           if(num >=0){
               rearr[pos] = num;
               pos+=2;
           }else{
               rearr[neg] = num;
               neg+=2;
           }
       }
       return rearr;
    }
}
