public class StringOp {
    public static void main(String[] args) {
        String s = "zxa*#%as#ds*";
        System.out.println(processStr(s));
    }

    private static String processStr(String s) {
        StringBuilder op = new StringBuilder();
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
        return op.toString();
    }
}
