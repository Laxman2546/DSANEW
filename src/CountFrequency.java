import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequency {
    public static ArrayList<String> frequencyStr(String str){
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int count = 0;
            for(int j=0;j<str.length();j++){
            if(str.charAt(i) == str.charAt(j)){
                    count++;
            }
            }
          ar.add(str.charAt(i)+ ":" + count);
        }
        return ar;
    }
    public static HashMap<Character,Integer> frequencyHash(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
        hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        return hm;
    }
    public static void main(String[] args) {
        String name = "Lakshman";
        ArrayList<String> count = frequencyStr(name);
        HashMap<Character,Integer> count2 = frequencyHash(name);
        System.out.println(count2);
//        System.out.println(count);
    }
}
