public class MaximumDistance {

    public static void main(String[] args) {
        int[] nums1 = {30,29,19,5};
        int[] nums2 = {25,25,25,25,25};
//        System.out.println(maxDistance(nums1,nums2));
        System.out.println(maxDistance2(nums1,nums2));
        
    }

    private static int maxDistance2(int[] nums1, int[] nums2) {
        int maxDistance=0,i = 0,j = 0;
            while(i<nums1.length && j < nums2.length){
                if(nums1[i] <= nums2[j]){
                    maxDistance = Math.max(maxDistance , j - i);
                    j++;
                }else{
                    i++;
                }

        }
        return maxDistance;
    }

    //bruteforce
    private static int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;
        for(int i=0;i<nums1.length;i++){
            int j = i;
            while(j < nums2.length){
                if(nums1[i] <= nums2[j]){
                    maxDistance = Math.max(maxDistance , j - i);
                }
                j++;
            }
        }
        return maxDistance;
    }

}
