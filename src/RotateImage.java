import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        for(int i=0;i<colLen;i++){
            for(int j=0;j<rowLen;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        int[][] newMat = new int[colLen][rowLen];
        for(int i=colLen-1;i>=0;i--){
            for(int j=rowLen-1;j>=0;j--){
                newMat[i][j] = matrix[j][i];
            }
        }
//        printMatrix(newMat);
        for(int i=0;i< matrix.length;i++){
                int left =0 ;
                int right = matrix[i].length-1;
                while(left < right){
                    int temp = newMat[i][left];
                    newMat[i][left] = newMat[i][right];
                    newMat[i][right] = temp;
                    left++;
                    right--;
                }

        }
        for(int i=0;i<colLen;i++){
            for(int j=0;j<rowLen;j++){
                matrix[i][j] = newMat[i][j];
            }
        }
//        printMatrix(newMat);
        printMatrix(matrix);
    }
}
