public class Primenumber {
    public static boolean isPrime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num % i  == 0){
                return true;
            }
        }
        return false;
    }
    public static int fibnocci(int n){
        if(n <= 1){
            return n;
        }
        return fibnocci(n-1) + fibnocci(n-2);
    }
    public static void fib2(int n){
        int firstterm = 0;
        int secondterm = 1;
        for(int i=1;i<=n;++i){
            System.out.print(firstterm + " ");
            int nxt = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nxt;
        }
        System.out.println();
        System.out.println("final Fib:" + (firstterm));
    }
    public static void main(String[] args) {
     boolean isPrime =  isPrime(7);
        System.out.println( fibnocci(8));
        fib2(8);
    }
}

