class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sk = new StringBuilder();
        int open = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;
            }else if(open <= 1 && s.charAt(i) == ')'){
                open--;
            }
            if(open > 1){
                sk.append(s.charAt(i));
                if(s.charAt(i) == ')')open--;
            }
        }
        return sk.toString();
    }
}