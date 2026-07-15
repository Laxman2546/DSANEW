public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(4));
    }
    public static int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int evenCount = 0,oddCount = 0;
        int i = 1;
        while(evenCount < n){
            if(i % 2 == 0){
                evenCount++;
                evenSum += i;
            }
            i++;
        }
        i = 1;
        while(oddCount < n){
            if(i % 2 != 0){
                oddCount++;
                oddSum += i;
            }
            i++;
        }
        return findGcd(evenSum,oddSum);
    }
    public static int  findGcd(int even,int odd){
        while(odd != 0){
            int temp = odd;
            odd = even % odd;
            even = temp;
        }

        return  even;
    }
}
