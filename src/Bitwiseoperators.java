public class Bitwiseoperators {
    public static void main(String[] args) {
        //even or odd
        int a = 8;
        int n = 2;
//        chekEvenOdd(a);
        nbit(a,n);
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

    private static void chekEvenOdd(int a) {
        if ((a & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
