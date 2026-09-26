class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
         int maxLeft = 0;
         int maxRight = 0;
        while(left < right){
          maxLeft = Math.max(height[left],maxLeft);
             maxRight = Math.max(height[right],maxRight);
           if(maxLeft < maxRight){
                res += maxLeft - height[left];
                left++;
           }else{
                res += maxRight - height[right];
                right--;
           }
        }
        return res;
    }
}