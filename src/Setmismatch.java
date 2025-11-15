import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setmismatch {
    public static  int[] checkMis(int[] arr){
        int ans[] = new int[2];
        int k = 0;
        Set<Integer> hs = new HashSet<>();
        for(int nums: arr){
            if(hs.contains(nums)){
                ans[k++] = nums;
            }
              hs.add(nums);
        }
        int n = arr.length;
        int total = n*(n+1)/2;
        int sum =0;
      for(int num : hs){
            sum+=num;
      }
        int Missing = total - sum;
        ans[1] = Missing;
        return ans;
    }
   public static void main(String[] args) {
        int arr[] = {1,1};
        int[] newArr =  checkMis(arr);
       System.out.println(Arrays.toString(newArr));
    }
}
