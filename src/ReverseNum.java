import java.util.HashSet;

public class ReverseNum {
    public static  int squareSum(int n){
        int res = 0;
        while(n > 0){
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
    public static  boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while (n != 0){
         n = squareSum(n);
        if (n == 1) return true;
        if(hs.contains(n)){
            return false;
        }else{
            hs.add(n);
        }
        }
        return  true;

    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));;
    }
}
