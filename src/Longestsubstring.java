public class Longestsubstring {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));

    }

    private static String longestPalindrome(String s) {
        String newString = "";
        int left = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == s.charAt(left)){
                newString += s.charAt(i);
            }
            left++;
        }
        return newString;
    }
}
