public class Longestsubstring {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(longestPalindrome(s));

    }

    private static String longestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder sk = new StringBuilder();
        while(left < right){
            if(s.charAt(left) ==  s.charAt(right)){
                sk.append(s.charAt(left));
            }
            right--;
            left++;
        }
        return sk.toString();
    }
}
