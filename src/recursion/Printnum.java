package recursion;

public class Printnum {
    public static void main(String[] args) {
        int n=15;
        printNum(n);
        printodd(n);
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

}
