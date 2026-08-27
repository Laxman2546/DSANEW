class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        StringBuilder current = new StringBuilder();
        boolean isGreater = false;
        boolean isSolved = solve(s,target,current,isGreater,0,count);
        return current.toString();
    }
    public static boolean solve(String s,String target,StringBuilder current,boolean isGreater,int i,int[] count){
        if(i == s.length()){
            if(isGreater){
                return true;
            }
            return false;
        }
        for(char ch = 'a';ch<= 'z';ch++){
            if(count[ch - 'a'] == 0) continue;
            if(isGreater == false && ch < target.charAt(i))continue;

            current.append(ch);
            count[ch - 'a']--;
            boolean isGreat = isGreater || ch > target.charAt(i); 
            if(solve(s,target,current,isGreat,i+1,count)){
                return true;
            };
            if (current.length() > 0){
                count[current.charAt(current.length() - 1) - 'a']++;
                current.deleteCharAt(current.length() - 1);
            }
        }
        return false;
    }
}