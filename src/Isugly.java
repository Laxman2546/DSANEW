public class Isugly {
    public static void main(String[] args) {
        int x = 23;
//            if(n<=0){
//                System.out.println(false);
//            }
//            int[] factors = {2,3,5};
//            for(int fact : factors){
//                while(n%fact == 0 ){
//                    n/=fact;
//                }
//            }
//             System.out.println(n==1);
//        }
        int sum = 0;
        int actual = x;
        while (x != 0) {
            int temp = x % 10;
            sum += temp;
            x = x / 10;
        }
        if (actual % sum == 0) {
            System.out.println(sum);
        }
        System.out.println(-1);
    }
}
