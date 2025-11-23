import java.math.BigInteger;
import java.util.Arrays;

public class ArraySum {
    public static  int[] sumArray(int[] arr){
        BigInteger result = BigInteger.ZERO;
        for(int nums: arr){
            result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(nums));
        }
        System.out.println(result);
        result  =result.add(BigInteger.ONE);
        String number = String.valueOf(result);
        char[] res =  number.toCharArray();
        int[] plusOne = new int[res.length];
        for(int i = 0 ;i<arr.length;i++){
            plusOne[i] = Character.getNumericValue(res[i]);
        }
        return plusOne;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] plus = sumArray(arr);
        System.out.println(Arrays.toString(plus));
    }
}
