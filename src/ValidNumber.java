import java.util.Stack;

public class ValidNumber {
    public static void main(String[] args) {
       String s = "2.";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
           if(s.matches("^[+-]?((\\\\d+\\\\.?\\\\d*)|(\\\\.\\\\d+))([eE][+-]?\\\\d+)?$")){
               return true;
           }
        return false;
    }
}
