class Solution {
    public boolean sumGame(String num) {
        int firstHalf = 0;
        int secondHalf = 0;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i < num.length() / 2) {
                if(num.charAt(i) == '?'){
                    firstHalf++;
                }else{
                    int numm = num.charAt(i) - '0';
                    firstSum += numm;
                }
            } else {
                if(num.charAt(i) == '?'){
                secondHalf++;
                }else{
                     int numm = (int) num.charAt(i) - '0';
                    secondSum += numm;
                }
            }
        }
        int totalQuestions = firstHalf + secondHalf;
        int sumDifference = firstSum - secondSum;
        int questionDiff = secondHalf - firstHalf;
        return totalQuestions % 2 == 1 || sumDifference != 9 * questionDiff / 2;

    }
}