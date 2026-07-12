import java.util.Arrays;
import java.util.HashMap;
public class RankArr {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] rank = new int[n];
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copyArr);
        HashMap<Integer,Integer> hm  = new HashMap<>();
        int ranked = 1;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(copyArr[i])){
                hm.put(copyArr[i],ranked);
                ranked++;
            }
        }
        for(int i=0;i<n;i++){
            rank[i] = hm.get(arr[i]);
        }
        return rank;
    }
}
