import java.util.HashMap;
import java.util.HashSet;

public class SpecialCharacters2 {
    public static void main(String[] args) {
        String s = "abDBAbb";
        HashMap<Character,Integer> hs = new HashMap<>();
        HashSet<Character> hm  =new HashSet<>();
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(Character.isUpperCase(chars[i]) && !hs.containsKey(chars[i])){
                hs.put(chars[i],i);
            }
        }
        if(!hs.isEmpty()){
        for(int i=0;i<chars.length;i++){
            if(Character.isLowerCase(chars[i])&& hs.containsKey(Character.toUpperCase(chars[i]))&&hs.get(Character.toUpperCase(chars[i]))>i&& !hm.contains(chars[i])){
                hm.add(chars[i]);
                count++;
            }else if(Character.isUpperCase(chars[i]) &&   hm.contains(Character.toLowerCase(chars[i]))&&hs.get(chars[i]) < i){
                hm.remove(Character.toLowerCase(chars[i]));
                count--;
            }
        }
        }
        System.out.println(count);
    }
}
