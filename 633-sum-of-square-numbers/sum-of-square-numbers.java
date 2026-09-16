class Solution {
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high = (int) Math.sqrt(c);
        while(low <= high){
            long val = (low * low) + (high * high);
            if(val == c){
                return true;
            }
            if(val < c){
                low = low + 1;
            }else{
                high = high - 1;
            }
        }
        return false;
    }
}