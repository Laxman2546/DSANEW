class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sk = new StringBuilder();
         solve(n,ans,sk);
         return ans;
    }
    public void solve(int n,List<String> ans , StringBuilder sk){
        if(sk.length() == 2*n){ 
            if(isValid(sk)){
                 ans.add(sk.toString());
            }
             return;
        }
        sk.append("(");
        solve(n,ans,sk);
        sk.deleteCharAt(sk.length() - 1);
        sk.append(")");
        solve(n,ans,sk);
        sk.deleteCharAt(sk.length() - 1);

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