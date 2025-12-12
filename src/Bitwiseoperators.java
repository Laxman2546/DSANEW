public class Bitwiseoperators {
    public static void main(String[] args) {
        //even or odd
        int a = 5;
        int n = 1;
//        chekEvenOdd(a);
//        nbit(a,n);
//        updateBit(a,n);
        swapNumbers(a,n);
    }

    private static void swapNumbers(int a, int n) {
        System.out.println(a); // 101
        System.out.println(n); // 001
        a=a ^n; // 100
        n= a ^n; // 101
        a = a ^ n; // 001
        System.out.println(a);
        System.out.println(n);
    }

    private static void nbit(int a,int n) {
        int mask  = 1 << n;
        if((mask & a) != 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(mask & a));

    }
    private static  void updateBit(int a, int n){
        System.out.println(Integer.toBinaryString(a));
        int mask = 1 << n;
        System.out.println(mask ^ a);
        System.out.println(Integer.toBinaryString(a ^ mask));
    }
    private static void chekEvenOdd(int a) {
        if ((a & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
