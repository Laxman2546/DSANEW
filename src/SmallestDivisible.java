public class SmallestDivisible {
    public static void main(String[] args) {
        System.out.println(smallestNumber(12,5));
    }
        public static int smallestNumber(int n, int t) {
            for(int i=n;i<=110;i++){
                int prod = 1;
                int num = i;
                while(num > 0){
                    int temp = num % 10;
                    prod *= temp;
                    num /= 10;
                }
                if(prod % t == 0)return i;
            }
            return n;
        }

}
