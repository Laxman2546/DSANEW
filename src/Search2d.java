import java.util.Arrays;

public class Search2d {
    public static  int[] searchMatrix(int[][] mat,int target){
        int row =0;
        int col = mat.length;
        while(row<=mat.length && col >=0){
            if(mat[row][col] == target){
                return new int[] {row,col};
            }else if(mat[row][col] < target){
                row++;

            }else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
            int[][] arr = {
                    {1,4,5},
                    {6,7,8},
                    };
            int target = 8;
        System.out.println(Arrays.toString(searchMatrix(arr,target)));
    }
}
