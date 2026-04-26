import java.util.HashMap;

public class SortVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(sortVowels(s));
    }
    public  static String sortVowels(String s){
        HashMap hm = new HashMap();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // Use the character 'c' as the key, not the whole string 's'
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }
    }
}
