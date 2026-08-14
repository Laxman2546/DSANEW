class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            char m = s.charAt(i);
            hm.put(m,hm.getOrDefault(m,0)+1);
           while(hm.get(m) > 2){
            char l = s.charAt(left);
            hm.put(l,hm.get(l)-1);
            left++;
           }
           maxLen = Math.max(maxLen,i - left+1);
        }
        return maxLen;
    }
}