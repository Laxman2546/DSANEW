package recursion;

public class Atoi {
    public static void main(String[] args) {
        String s = "1337c0d3";
        int res = myAtoi(s);
        System.out.println(res);
    }
    public static int myAtoi(String s) {
        return Integer.parseInt(atoi(s,0));
    }

    private static String atoi(String s, int i) {
        if(i == s.length() || s.charAt(i)!=)
        atoi(s,i+1);
    }
    public long power(long base, long exp) {
        long res = 1;
        long mod = 1_000_000_007;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }

    public int countGoodNumbers(long n) {
        long evenIndices = (n + 1) / 2;
        long oddIndices = n / 2;
        return (int) ((power(5, evenIndices) * power(4, oddIndices)) % 1_000_000_007);
    }
}
