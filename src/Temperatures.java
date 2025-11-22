import java.util.Arrays;
import java.util.Stack;

public class Temperatures {
    //bruteforce
    public static int[] dailyTemperatures(int[] temperatures){
        int n =temperatures.length;
        int[] arr = new int[n];
        int k=0;
        for(int i=0; i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(temperatures[i] < temperatures[j]){
                    arr[k++]  =count += 1;
                    break;
                }else{
                    count += 1;
                }
            }
        }


        return arr;
    }
    //optimized
    public static  int [] dailyTemp(int[] temperatures){
        int n = temperatures.length;
        int[] ans = new int[n];
        int k = 0;
        Stack<Integer> sk = new Stack<>();
        for(int i = 0 ; i<n;i++){
            while(!sk.isEmpty() && temperatures[i] > temperatures[sk.peek()]){
                int prevIdx = sk.pop();
                ans[prevIdx] = i- prevIdx;
            }
            sk.push(i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] temperatures = {55,38,53,81,61,93,97,32,43,78};
        int[] result = dailyTemp(temperatures);
        int[] result2 = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

    }
}
