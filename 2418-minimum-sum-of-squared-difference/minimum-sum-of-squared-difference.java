class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int maxLen = 0;
        for(int max = 0;max<nums1.length;max++){
            maxLen = Math.max(maxLen,Math.abs(nums1[max]-nums2[max]));
        }
        long k = k1+k2;
        int[] freq = new int[maxLen+1];
        for(int i=0;i<nums1.length;i++){
            int diff = Math.abs(nums1[i] - nums2[i]);
             freq[diff]++;
        }
        for(int j=freq.length-1;j>0;j--){
            if(k <= 0)break;
            if(freq[j] == 0)continue;
            long countOps = Math.min((long)freq[j],k);
            freq[j] =  freq[j] - (int)countOps;
            freq[j-1] = freq[j-1] + (int)countOps; 
            k -= countOps;
        }
        long res = 0;
        for(int m= 1;m<freq.length;m++){
            if(freq[m] == 0)continue;
            res +=(long) freq[m] *(long) m * m;
        }
        return res;

    }
}