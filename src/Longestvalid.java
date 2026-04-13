import java.util.Stack;

public class Longestvalid {
    public static int longestValidParentheses(String s){
        Stack<Character> sk = new Stack<>();
        int count = 0;
        for(int  i=0;i<s.length();i++){
        if(!sk.isEmpty() && s.charAt(i) == '(') {
            sk.push(s.charAt(i));
        }else if(!sk.isEmpty() && s.charAt(i) == ')' && sk.peek() == '('){
            sk.pop();
            count += 2;
        }else if(sk.isEmpty()){
            sk.push(s.charAt(i));
        }
        }
        return count;
    }
    public static void main(String[] args) {
        String parntheses = "(()";
        System.out.println(longestValidParentheses(parntheses));
    }
}
