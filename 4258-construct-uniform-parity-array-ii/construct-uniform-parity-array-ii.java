class Solution {
    public boolean uniformArray(int[] nums1) {
    Arrays.sort(nums1);
      if(nums1[0] % 2 == 0){
            int odd = 0;
            for(int i=0;i<nums1.length;i++){
                if(nums1[i] % 2 == 1){
                    odd = nums1[i];
                    break;
                }
            }
            if(odd == 0 )return true;
            for(int i=0;i<nums1.length;i++){
                if(nums1[i] % 2 == 0){
                    continue;
                }else{
                    int res = nums1[i] - odd;
                    if(res >= 1 && res % 2 == 0){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
      }else{
           for(int i=0;i<nums1.length;i++){
                if(nums1[i] % 2 == 1){
                    continue;
                }else{
                    int res = nums1[i] - nums1[0];
                    if(res % 2 == 1){
                        continue;
                    }
                    return false;
                }
            }  
      }
      return true;
    }
}