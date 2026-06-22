import java.util.HashMap;
import java.util.Map;

public class Ballon {
    public static void main(String[] args) {
        String text = "loonablxbllapon";
        System.out.println(maxNumberOfBalloons(text));
    }

    private static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int ans = Integer.MAX_VALUE;
        String text2 = "ballon";
        for(int j=0;j<text2.length();j++){
            if(!map.containsKey(text2.charAt(j))){
                return 0;
            }
            else if(text2.charAt(j) != 'l' && text2.charAt(j)!='o'){
                ans = Math.min(map.get(text2.charAt(j)),ans);
            }else{
                ans = Math.min(map.get(text2.charAt(j))/2,ans);
            }
        }
        return ans;
    }
}
