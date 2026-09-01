class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int a = 0;
        for(int i=purchaseAmount;i<=100;i++){
            if(i % 10 == 0){
                a = i;
                break;
            }
        }
        int b = 0;
        for(int i=purchaseAmount; i>= 10;i--){
            if(i % 10 == 0){
                b = i;
                break;
            }
        }
        int ansA = a - purchaseAmount;
        int ansB = purchaseAmount - b;
        System.out.println(ansA + " " + ansB);
        return ansA <= ansB ? 100 - a : 100 - b; 
    }
}