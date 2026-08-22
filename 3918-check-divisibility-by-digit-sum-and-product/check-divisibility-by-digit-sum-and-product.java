class Solution {
    public boolean checkDivisibility(int n) {
        int k = n;
        int sum = 0;
        int prod = 1;
        while(k > 0){
            int temp = k % 10;
            sum += temp;
            prod *= temp;
            k /= 10;
        }
        int res = sum + prod;
        System.out.println(res);
        return n % res == 0;
    }
}