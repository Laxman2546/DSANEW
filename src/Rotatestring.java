public class Rotatestring {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotatestring(s,goal));
    }

    private static boolean rotatestring(String s, String goal) {
        String concat = s + s;

        if(goal.length() != s.length()){
            return false;
        }
        return concat.contains(goal);
    }
}
