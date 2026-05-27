package dynamicprogramming;

public class EditDistance {
    public static void main(String[] args) {
        String m = "movie";
        String n = "love";
        System.out.println(editdist(m,n));
    }

    private static int editdist(String m, String n) {
        int i = m.length()-1;
        int j = n.length()-1;
        return distcalc(m,n,i,j);
    }

    private static int distcalc(String m, String n, int i, int j) {
        //base cond
        if(i==-1){
            return j+1;
        }
        if(j==-1) return i+1;
        if(m.charAt(i) == n.charAt(j)){
            return distcalc(m,n,i-1,j-1);
        }else{
        int insert =  distcalc(m,n,i,j-1);
        int replace =  distcalc(m,n,i-1,j-1);
        int delete =  distcalc(m,n,i-1,j);
        return 1 + Math.min(insert,Math.min(replace,delete));
        }
    }
}
