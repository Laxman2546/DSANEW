package recursion;

public class Printnum {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
//        printNum(n);
//        printodd(n);
//        System.out.println(printSum(6));
//        System.out.println(factorial(6));
          System.out.println(pow(x,n));
    }

    private static void printodd(int n) {
        if(n >30) return;
        System.out.println(n);
        printodd(n+2);
    }
    private static void printNum(int n) {
        if (n > 20) return;
        System.out.println(n);
        printNum(n + 1);
    }
    private static int printSum(int n){
        if(n == 0){
            return 0;
        }
        return n + printSum(n-1);
    }
    private static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    private static  int pow(int x,int n){
        if(n == 0){
            return 1;
        }
        if(n == 1)return x;
        if(n%2 == 0){
            return pow(x*x,n/2);
        }else{
            return x*pow(x,n-1);
        }
    }
}
