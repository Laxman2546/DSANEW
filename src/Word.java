import java.util.HashMap;

public class Word {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        String[] word = s.trim().split(" ");
        if(pattern.length() != word.length){
            return  false;
        }
        for(int i=0;i<pattern.length();i++){
            if(!hm.isEmpty() && hm.containsKey(pattern.charAt(i)) ){
                String value = hm.get(pattern.charAt(i));
                if(!word[i].equals(value)){
                    return false;
                }
            }else{
                if(hm.containsValue(word[i])){
                    return false;
                }
                hm.put(pattern.charAt(i),word[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

}
