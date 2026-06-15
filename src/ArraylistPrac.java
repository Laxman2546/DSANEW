import java.util.ArrayList;
import java.util.List;

public class ArraylistPrac {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        int num = 3;
        for(int i=0 ;i<num;i++){
            List<Integer> sls = new ArrayList<>();
            for(int j=0;j<=i;j++){
               if(i==j||j==0) {
                   sls.add(1);
               }else{
                   sls.add(ls.get(i-1).get(j-1) + ls.get(i-1).get(j));
               }
            }
            ls.add(sls);
        }
        System.out.println(ls);
        System.out.println(ls.get(ls.size()-1));


    }
    public static List<Integer> pascalSame(int num){
        List<Integer> ls = new ArrayList<>();
        List<Integer> dum = new ArrayList<>();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    dum.add(1);
                }else{

                }

            }
        }
        return dum;
    }
}
