public class Rainwater {
    public static void main(String[] args) {
        int[] heights = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(heights));
    }
    public static int trap(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int maxWat = 0;
        while(left < right){
            leftMax = Math.max(heights[left],leftMax);
            rightMax = Math.max(heights[right],rightMax);
            if(leftMax < rightMax){
                maxWat += leftMax-heights[left];
                left++;
            }else{
                maxWat +=rightMax-heights[right];
                right--;
            }
        }
        return maxWat;
    }
}
