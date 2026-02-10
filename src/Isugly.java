public class Isugly {
    public static void main(String[] args) {
        int n = 10;
            if(n<=0){
                System.out.println(false);
            }
            int[] factors = {2,3,5};
            for(int fact : factors){
                while(n%fact == 0 ){
                    n/=fact;
                }
            }
             System.out.println(n==1);
        }


}
