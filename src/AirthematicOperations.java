import java.util.Stack;

public class AirthematicOperations {
    public static void main(String[] args) {
        String exp = "2+5*3*6";
        int ans = calculateAns(exp);
        System.out.println(ans);
    }

    private static int calculateAns(String exp) {
        if (exp == null || exp.isEmpty()) return 0;
        Stack<Integer> sk = new Stack<>();
        int ans = 0;
        char oper = '+';
        int current  = 0;
        for(int i = 0;i<exp.length();i++){
            if(Character.isDigit(exp.charAt(i))){
                current = current * 10 + (exp.charAt(i) - '0');
            }
            if(!Character.isDigit(exp.charAt(i)) && exp.charAt(i) != ' ' || i== exp.length()-1){
                if(oper == '+'){
                    sk.push(current);
                }
                else if(oper == '*'){
                    sk.push(sk.pop() * current);
                }
                oper = exp.charAt(i);
                current = 0;
            }
        }
        while(!sk.isEmpty()){
            ans+= sk.pop();
        }
        return ans;
    }

}
