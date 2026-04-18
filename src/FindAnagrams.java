import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAnagrams {
    public static boolean findanagrams(String s,String p){
        HashSet<Character> hm = new HashSet<>();
        char[] letters = p.toCharArray();
        for(char lett : letters){
            hm.add(lett);
        }
        for(int i=0;i<s.length();i++){
            if(!hm.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            String s = "nagaram";
            String p = "anagram";
            System.out.println(findanagrams(s,p));
    }

}
