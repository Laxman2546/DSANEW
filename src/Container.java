public class Container {
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWat = 0;
        while(left < right){
            int minWat = Math.min(heights[left],heights[right]);
            maxWat = Math.max(maxWat,minWat*Math.abs(left-right));
            if(minWat == heights[left]){
                left++;
            }else{
                right--;
            }
        }
        return maxWat;
    }
}
