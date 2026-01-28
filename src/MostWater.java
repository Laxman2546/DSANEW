
public class MostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0;
        int leftIdx = 0;
        int rightIdx = 0;
        int maxRight = 0;
        int minNum  = 0;
        int res = 0;
        while(left < right){
            int temp = maxLeft;
            maxLeft  = Math.max(maxLeft,height[left]);
            if(maxLeft != temp){
                leftIdx = left;
            }
            int temp2 = maxRight;
            maxRight = Math.max(maxRight,height[right]);
            if(maxRight != temp2){
                rightIdx = right;
            }
            left++;
            right--;
        }
        minNum = Math.min(maxLeft,maxRight);
        if(minNum == maxRight){
            res = (rightIdx - leftIdx) * minNum;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
