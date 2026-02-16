import java.lang.classfile.instruction.SwitchCase;
import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Character> sk = new Stack<>();
        s.trim();
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != ' ' && !sk.isEmpty() ){
                switch (s.charAt(i)){
                    case '+':
                        res+= sk.pop();
                        break;
                    case '-':
                        res -= sk.pop();
                        break;
                }
            }else if(s.charAt(i) != ' '){
                sk.push(s.charAt(i));
            }
        }
        return res;
    }
}
public class CalculateSum {
    public static void main(String[] args) {
        String s = " 1+ 1 ";
       Solution sol  = new Solution();
        System.out.println(sol.calculate(s));
    }
}
