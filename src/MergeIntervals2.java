import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals2 {
    public static void main(String[] args) {
        int[][] intervals = {{1,6},{4,8},{9,11},{12,15},{13,14}};
        List<int[]> ans  =mergeIntervals(intervals);
        for(int[] an : ans){
            System.out.println(Arrays.toString(an));
        }
    }

    private static List<int[]> mergeIntervals(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(currentEnd >= nextStart){
                    currentEnd = Math.max(currentEnd ,nextEnd);
            }else{
                int[] ans = {currentStart,currentEnd};
                res.add(ans);
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }
        res.add(new int[]{currentStart,currentEnd});
        System.out.println(Arrays.deepToString(intervals));

        return res;
    }
}
