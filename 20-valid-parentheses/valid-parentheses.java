class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!sk.isEmpty()&& s.charAt(i) == '(' ||s.charAt(i) == '['||s.charAt(i) == '{'){
                sk.push(s.charAt(i));
            }else if(!sk.isEmpty()&& sk.peek()=='(' && s.charAt(i)== ')' ||
            !sk.isEmpty()&&
                sk.peek()=='[' && s.charAt(i)== ']'||!sk.isEmpty()&&sk.peek()=='{' && s.charAt(i)== '}'){
                sk.pop();
                }else{
                    sk.push(s.charAt(i));
                }
        }
        return sk.isEmpty(); 
    }
}