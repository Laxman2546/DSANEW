import java.util.Arrays;

public class ShiftGrid {
    public static void main(String[] args) {
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        for(int i=0;i<k;i++){
           grid = shiftGrid(grid,k);
        }
    }

    private static int[][] shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] newMat  = new int[row][col];
        for(int i=0;i<newMat.length;i++){
            for(int j=1;j<newMat[0].length;j++){
                newMat[i][j] = grid[i][j-1];
            }
        }
        for(int[] nums : grid){
            System.out.println(Arrays.toString(nums));
        }
        if(row > 1){
            for(int i=1;i<row;i++){
                newMat[i][0] = grid[i-1][col-1];
            }
        }
        System.out.println();
        newMat[0][0] = grid[row-1][col-1];
        for(int[] nums : newMat){
            System.out.println(Arrays.toString(nums));
        }
        return newMat;
    }
}
