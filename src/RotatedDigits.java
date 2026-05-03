public class RotatedDigits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rotatedigits(n));
    }

    private static int rotatedigits(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
           if(hasGood(i)){
               count++;
           }
        }
        return count;
    }

    private static boolean hasGood(int n) {
        boolean hasChange = false;
        while(n > 0){
        int dg = n % 10;
        if(dg == 3||dg == 4||dg == 7)return false;
        if(dg == 2||dg == 5|| dg==6||dg == 9){
            hasChange = true;
        }
        n/=10;
        }
        return  hasChange;
    }

}
