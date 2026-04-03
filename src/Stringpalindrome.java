import java.util.ArrayList;
import  java.util.List;
public class Stringpalindrome {
    public static boolean checkisPalindorme(String word){
        int left = 0;
        int right = word.length()-1;
        while(left < right){
            if(word.charAt(left)!= word.charAt(right)){
            return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String wordRev(String word){
        StringBuffer sb = new StringBuffer();
        for(int i=word.length()-1 ;i>=0;i--){
        sb.append(word.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {

            String name = "Madam Arora teaches malayalam at noon!";
            String[] words = name.split(" ");
            List<String> palindrome = new ArrayList<>();
            List<String> reverse = new ArrayList<>();
            for(String word : words){
                boolean isPalin = checkisPalindorme(word.toLowerCase());
                if(isPalin){
                    palindrome.add(word);
                }else{
                    reverse.add(wordRev(word));
                }
            }
            System.out.println(palindrome);
            System.out.println(reverse);
    }

}
