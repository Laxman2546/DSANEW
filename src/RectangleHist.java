import java.util.Arrays;
import java.util.Stack;

public class RectangleHist {
    public static int[] prevSmall(int[] heights){
        Stack<Integer> sk = new Stack<>();
        int n = heights.length;
        int[] smallest = new int[n];
        for(int i=0;i<n;i++){
            while (!sk.isEmpty() && heights[sk.peek()] >= heights[i]){
               sk.pop();
            }
            smallest[i] = sk.isEmpty() ? -1:sk.peek();
            sk.push(i);
        }
        return smallest;
    }
    public static int[] nextSmall(int[] heights){
        Stack<Integer> sk = new Stack<>();
        int n = heights.length;
        int[] nxtSmall = new int[n];
        for(int i=n-1;i>=0;i--){
            while (!sk.isEmpty() && heights[sk.peek()] >= heights[i]){
                sk.pop();
            }
            nxtSmall[i] = sk.isEmpty() ? -1:sk.peek();
            sk.push(i);
        }
        return nxtSmall;
    }
    public static  int largestRectangleArea(int[] heights){
        int maxArea = 0;
        int n = heights.length;
        int[] small = prevSmall(heights);
        int[] nxtSmall = nextSmall(heights);
        for(int i=0;i<n;i++){
            int nxsm =  nxtSmall[i]<0?n : nxtSmall[i];
            int prsm = small[i];
            int sub = nxsm - prsm- 1;
            int area = heights[i] * sub  ;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int LargestHe = largestRectangleArea(heights);
        System.out.println(LargestHe);
    }
}
