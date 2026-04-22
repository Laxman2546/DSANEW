import java.util.ArrayList;
import java.util.List;

public class Twoedits {
    public static void main(String[] args) {
        String[] queries = {"tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"};
        String[] dictionary = {"uyj","bug","dba","xbe","blu","wuo","tsf","tga"};
        System.out.println(twoEditwords(queries,dictionary));
    }

    private static List<String> twoEditwords(String[] queries, String[] dictionary) {
        List<String> ls = new ArrayList<>();
        int stringLength = queries[0].length();
        for(String query:queries){
            for(String dict : dictionary){
                int count = 0;
                for(int i=0;i<stringLength;i++){
                    if(query.length() != dict.length()){
                        break;
                    }
                    if(query.charAt(i)!=dict.charAt(i)){
                        count++;
                    }
                    if(count > 2) break;
                }
                if(count < 3){
                    ls.add(query);
                    break;
                }
            }
        }
        return ls;
    }
}
