import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergeintervals {
    public static void main(String[] args) {
       int[][] interval = {{4,7},{1,4}};
        int[][] ans = merge(interval);
        for (int[] res : ans){
            System.out.println(Arrays.toString(res));
        }
    }

    private static int[][] merge(int[][] inter) {
        Arrays.sort(inter, (a,b) -> a[0] ==b[0] ? a[1]-b[1] : a[0]-b[0]);
        List<int[]> ls = new ArrayList<>();
        int currentStart = inter[0][0];
        int currentEnd = inter[0][1];
        for(int i=1;i<inter.length;i++){
            int nextStart = inter[i][0];
            int nextEnd = inter[i][1];
            if(currentEnd >= nextStart){
                    currentEnd = Math.max(currentEnd,nextEnd);
            }else{
                ls.add(new int[]{currentStart,currentEnd});
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }
        ls.add(new int[]{currentStart,currentEnd});
        return  ls.toArray(new int[ls.size()][]);
    }
}
