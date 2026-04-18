public class MirrorDistance {
    public static  int reverse(int n){
        int num = 0;
        while(n > 0){
            int digit = n %10;
            num = num * 10 + digit;
            n /= 10;
        }
        return num;
    }
    public static  int mirrorDistance(int n){
        int reversed = reverse(n);
        return Math.abs(n - reversed);
    }
    public static void main(String[] args) {
            int n = 9;
        System.out.println(mirrorDistance(n));
    }
}
