class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Boolean[][] memo = new Boolean[n][n+1];
        return checkString(s,0,0,memo);
    }
    public boolean checkString(String s,int i,int c,Boolean[][] memo){
        if(i == s.length()){
            return c==0;
        }
        if(c < 0){
            return false;
        }
        if(memo[i][c] != null){
            return memo[i][c];
        }
        if(s.charAt(i) == '('){
            return memo[i][c] = checkString(s,i+1,c+1,memo);
        }else if(s.charAt(i) == ')'){
            return memo[i][c] = checkString(s,i+1,c-1,memo);
        }else{
            return memo[i][c] = checkString(s,i+1,c+1,memo) || checkString(s,i+1,c-1,memo) || checkString(s,i+1,c,memo);
        }
    }
}