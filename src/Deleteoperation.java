public class Deleteoperation {
    public static void main(String[] args) {
        String word1 = "heap";
        String word2 = "pea";
        System.out.println(minDistance(word1,word2));
    }

    private static int minDistance(String word1, String word2) {
        int count = 0;
        int maxCount = 0;
        int left = 0;
        int right = 0;
        int w1count = word1.length();
        int w2count = word2.length();
        while(left < w1count && right < w2count){
            if(word1.charAt(left) == word2.charAt(right)){
                count++;
                maxCount = Math.max(count,maxCount);
                left++;
                right++;

            }else if(count > 0&& word1.charAt(left) != word2.charAt(right)){
                right = 0;
                count = 0;
            }
            else{
                left++;
                right = 0;
                count = 0;
            }
        }
        int ans = w1count - maxCount + w2count - maxCount;
        return ans;
    }
}
