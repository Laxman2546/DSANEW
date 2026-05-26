import java.util.HashSet;

public class SpecialCharacters {
    public static void main(String[] args) {
        String s = "abBCab";
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        char[] chars = s.toCharArray();
        for(Character ch : chars){
            if(Character.isUpperCase(ch)){
                hs.add(ch);
            }
        }
        for(Character ch : chars){
            if(Character.isLowerCase(ch)&&hs.contains(Character.toUpperCase(ch))){
                hs.remove(Character.toUpperCase(ch));
                count++;
            }
        }
        System.out.println(count);
    }
}
