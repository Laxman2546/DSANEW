import java.util.*;
public class SmallestSubsequence {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(smallestSubsequence(s));
    }
    public static String smallestSubsequence(String s) {
        Stack<Character> sk = new Stack<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        boolean[] vis = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
            if(vis[curr - 'a']) continue;
            while(!sk.isEmpty() && sk.peek() > curr && hm.get(sk.peek())>0){
                char popped = sk.pop();
                vis[popped - 'a'] = false;
            }
            sk.push(curr);
            vis[curr - 'a'] = true;
        }
        System.out.println(sk);
        StringBuilder sb = new StringBuilder();
        while(!sk.isEmpty()){
            sb.append(sk.pop());
        }git
        sb.reverse();
        return sb.toString();
    }
}
