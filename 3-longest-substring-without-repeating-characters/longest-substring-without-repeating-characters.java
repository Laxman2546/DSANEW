class Solution {
   public  int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            if(!hs.contains(c)){
                hs.add(c);
            }else{
                while(hs.contains(c)){
                    hs.remove(s.charAt(left));
                    left++;
                }
                hs.add(c);
            }
            count = Math.max(count,(right - left + 1));
        }
        return count;
    }
}