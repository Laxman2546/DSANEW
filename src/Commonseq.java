public class Commonseq {
    public static void main(String[] args) {
        String text1 = "abcd";
        String text2 = "edca";
        System.out.println(longestCommonSubsequence(text1,text2));
        System.out.println(Math.floor(Math.sqrt(8)));
    }

    private static int longestCommonSubsequence(String text1, String text2) {
        int count = 0;
        int maxCount = 0;
        int left = 0;
        int right = 0;
        int w1count = text1.length();
        int w2count = text2.length();
        while(left < w1count && right < w2count){
            if(text1.charAt(left) == text2.charAt(right)){
                count++;
                maxCount = Math.max(count,maxCount);
                left++;
                right++;
            }
            else{
               right++;
            }
        }
      return maxCount;
    }

}
