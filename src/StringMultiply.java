import java.math.BigInteger;

public class StringMultiply {
    public static String multiply(String num1,String num2){
        BigInteger big = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger sol = big.multiply(big2) ;
        return String.valueOf(sol);
    }
    public static void main(String[] args) {
        String num1 = "17827182162716726172671";
        String num2 = "5";

        System.out.println(multiply(num1,num2));
    }
}
