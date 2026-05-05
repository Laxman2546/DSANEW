package recursion;

public class Gpt {
    public static void main(String[] args) {
//        printNums(5);
//        printNums2(5);
        System.out.println(naturalNum(5));
        System.out.println(factoriaNum(5));
        System.out.println(powern(2,-10));

    }

    private static int factoriaNum(int n) {
        if(n == 0){
            return 1;
        }
        return  n * factoriaNum(n -1);
    }
    private static void printNums(int n) {
        if(n < 1){
            return;
        }
        printNums(n- 1);
        System.out.println(n);
    }
    private static void printNums2(int n) {
        if(n < 1){
            return;
        }
        System.out.println(n);
        printNums2(n- 1);
    }
    private static int naturalNum(int n){
        if(n < 1){
            return 0;
        }
        return   n + naturalNum(n-1);
    }
    private static double powern(int x ,int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 1 / powern(x,-n);
        }
        double half = powern(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}
