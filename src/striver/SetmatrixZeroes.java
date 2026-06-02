package striver;

import java.util.Arrays;
import java.util.Stack;
class Number {
    int first;
    int second;
    Number(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class SetmatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroesoptimize(matrix);
        for(int[] num : matrix)
            System.out.println(Arrays.toString(num));
    }

    private static void setZeroes(int[][] matrix) {
        Stack<Number> sk = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                   sk.push(new Number(i,j));
                }

            }
        }
        while(!sk.isEmpty()){
            Number num = sk.pop();
            int i = num.first;
            int j = num.second;
            if (matrix[i][j] == 0) {
            int top = i;
            int bottom = i;
            int left = j;
            int right = j;
            while (top >= 0 || bottom < matrix.length){
                if(top >= 0){
                    matrix[top][j] = 0;
                };
                if(bottom <= matrix.length) {
                    matrix[bottom][j] =0;
                };
                top--;
                bottom++;
            }
            while (left >= 0 || right < matrix[0].length ){
                if(left >= 0){
                    matrix[i][left] = 0;
                };
                left--;
                if(right <= matrix[0].length-1) {
                    matrix[i][right] =0;
                };
                right++;
            }
        }
        }
    }
    private static  void setZeroesoptimize(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(matrix[i][j] == 0){
                    row[i] =true;
                    col[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]||col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
