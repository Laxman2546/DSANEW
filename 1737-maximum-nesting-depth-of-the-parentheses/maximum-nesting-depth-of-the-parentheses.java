class Solution {
    public int maxDepth(String s) {
       int open = 0;
       int count = 0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '('){
            open++;
        }else if(s.charAt(i) == ')'){
            count = Math.max(count,open);
            open--;
        }
       } 
       return count;
    }
}