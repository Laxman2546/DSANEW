import java.util.Arrays;

public class Discount {
    //bruteforce
    public static  int[] finalPrices(int[] prices){
        int[] res = new int[prices.length];
        int k=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    res[k++] = prices[i]-prices[j];
                    break;
                }
            }
            if(i+1 != k && i<prices.length && k<prices.length){
                res[k++] = prices[i];
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        int[] result = finalPrices(prices);
        System.out.println(Arrays.toString(result));
    }
}
