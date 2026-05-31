import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Asteroids {
    public static void main(String[] args) {
        int[] a = {3,9,19,5,21};
        int m = 10;
        System.out.println(asteroidsDestroyed(m,a));
    }

    private static boolean asteroidsDestroyed(int m, int[] a) {
        Arrays.sort(a);
       long c = m;
        for(int as : a){
           if(as>c){
               return false;
           }
           c+=as;
       }
        return true;
    }
}
