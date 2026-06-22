import java.util.HashMap;
import java.util.HashSet;

public class StringOp {
    public static void main(String[] args) {
        String s = "z*#";
        long k = 1;
        System.out.println(processStr(s,k));
    }

    private static char processStr(String s,long k) {
        StringBuilder op = new StringBuilder();
        HashMap<Long,Character> hs = new HashMap();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                op.append(s.charAt(i));
            }else if(!op.isEmpty() && s.charAt(i) == '#'){
                op.append(op);
            }else if(!op.isEmpty() && s.charAt(i) == '*'){
                op.deleteCharAt(op.length()-1);
            }else if (!op.isEmpty() &&s.charAt(i) == '%'){
                op.reverse();
            }
        }
        for(long i=0;i<op.length();i++){

            hs.put(i,op.charAt((int) i));
        }

        return k <= op.length() ?hs.get(k): '.';
    }
}
