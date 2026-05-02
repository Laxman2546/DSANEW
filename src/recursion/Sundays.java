package recursion;

public class Sundays {
    public static void main(String[] args) {
        int n=1;
        int k = 1;
        int res = countSun(n,k);
    }

    private static int countSun(int n,int k) {
        if(n<7){
        int diff = 7-n;
        return countSun(n+diff,k+diff);
        }
        if(k >= 30) return n;

        System.out.println(k);
        return countSun(n,k+7);
    }

}
