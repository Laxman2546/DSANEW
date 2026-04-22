import java.util.Stack;

public class LongestValidParanthesses {
    public static void main(String[] args) {
        String parantheses = "(())";
        System.out.println(longestValidParentheses(parantheses));
    }

    private static int longestValidParentheses(String p) {
        Stack<Integer> sk = new Stack();
        int maxCount = 0;
        sk.push(-1);
        for(int i =0;i<p.length();i++){
            if(p.charAt(i) == '('){
                sk.push(i);
            }else{
                sk.pop();
            }
            if(sk.isEmpty()){
                sk.push(i);
            }else{
                maxCount = Math.max(maxCount,i-sk.peek());
            }
        }
        return maxCount;
    }
}
