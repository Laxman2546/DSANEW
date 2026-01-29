import java.util.Stack;

public class Subseq {
    public static boolean isSubsequence(String s, String t){
        Stack<Character> sk = new Stack<>();
        char[] sub =  s.toCharArray();
        char[] string = t.toCharArray();
        for(int i=sub.length-1;i>=0;i--){
            sk.push(sub[i]);
        }
        for(int i=0;i<string.length;i++){
            if(!sk.isEmpty() && sk.peek() == string[i]) {
                char pop = sk.pop();
                System.out.println(pop);
            }
        }
        return sk.isEmpty() ? true : false;

    }
    public static void main(String[] args) {
        String s = "abx";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
