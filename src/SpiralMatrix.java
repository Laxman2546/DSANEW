import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
    int[][] mat  = {
             {1,2,3}
            ,{4,5,6}
            ,{7,8,9}};
    List<Integer> ls = spiralOrder(mat);
        System.out.println(ls);
    }
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ls = new ArrayList<>();
        if(mat.length == 0) {
            return ls;
        }
        int m= mat.length;
        int n = mat[0].length;
        int sRow = 0;
        int sCol = 0;
        int endRow = m-1;
        int endCol = n-1;
        while(sRow <= endRow && sCol <= endCol){
            //top
            for(int i=sCol;i<=endCol;i++){
                ls.add(mat[sRow][i]);
            }
            //right
            for(int i=sRow+1;i<=endRow;i++){
                ls.add(mat[i][endCol]);
            }
            //bottom
            for(int i=endCol-1;i>=sCol;i--){
                if(sRow == endRow ){
                break;
                }
                ls.add(mat[endRow][i]);
            }
            //left
            for(int i=endRow-1;i>=sRow+1;i--){
                if(sRow == endCol){
                    break;
                }
                ls.add(mat[i][sCol]);
            }
            sRow++;
            sCol++;
            endRow--;
            endCol--;
        }


        return ls;

    }
}
