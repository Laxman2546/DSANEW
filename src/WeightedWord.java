import java.util.HashMap;

public class WeightedWord {
    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,weights));
    }
    public static String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Integer,Character> res = new HashMap<>();

        for(int i=0;i<weights.length;i++){
            char ch = (char) (97 + i);
            hm.put(ch,weights[i]);
        }
        for(int i=0;i<=26;i++){
            char ch = (char) (122 - i);
            res.put(i,ch);
        }
        StringBuilder sm = new StringBuilder();
        for(String word : words){
            int ans = 0;
            for(int j=0;j<word.length();j++){
                int sum = hm.get(word.charAt(j));
                ans+= sum;
            }
            int charNum = ans % 26;
            Character resAns = res.get(charNum);
            sm.append(resAns);
        }


        return sm.toString();
    }
}
