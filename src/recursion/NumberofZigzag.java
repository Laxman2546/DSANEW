package recursion;

public class NumberofZigzag {
    public static void main(String[] args) {
        int n = 3;
        int l = 1;
        int r = 3;
        System.out.println(zigZagArrays(n,l,r));
    }

    private static int zigZagArrays(int n, int l, int r) {
        return solve(n,l,r);
    }

    private static int solve(int n, int l, int r) {
        if(n==0){
            return 0;
        }
        return 5;
    }
}
