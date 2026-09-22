class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sk = new StringBuilder();
         solve(n,ans,sk,0,0);
         return ans;
    }
    public void solve(int n,List<String> ans , StringBuilder sk,int open,int close){
        if(sk.length() == 2*n){ 
            ans.add(sk.toString());
             return;
        }
        if(open < n){
        sk.append("(");
        solve(n,ans,sk,open+1,close);
        sk.deleteCharAt(sk.length() - 1);
        }
        if(close < open){
        sk.append(")");
        solve(n,ans,sk,open,close+1);
        sk.deleteCharAt(sk.length() - 1);
        }

    }
    private boolean isValid(StringBuilder sk){
        int countOpening = 0;
        for(int i=0;i<sk.length();i++){
            if(sk.charAt(i) == '('){
                countOpening++;
            }else{
                countOpening--;
            }
            if(countOpening < 0)return false;
        }
        return countOpening == 0;
    }
}