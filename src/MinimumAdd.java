import java.util.Stack;

public class MinimumAdd {
    public static  int minimumAdd(String s){
        Stack<Character> sk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!sk.isEmpty()&&sk.peek()=='('&&ch==')'){
                sk.pop();
            }else{
                sk.push(ch);
            }
        }
        return  sk.size();
    }

    public static void main(String[] args) {
        String s = "(())((()())(";
        int count = minimumAdd(s);
        System.out.println(count);
    }
}
