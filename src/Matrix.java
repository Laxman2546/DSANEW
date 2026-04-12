import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr1= {
                {2,4,6},
                {2,4,6},
                {2,4,6}};
        int[][] arr2 = {
                {2,4,6},
                {2,4,6},
                {2,4,6}};
        int rowA = arr1.length;
        int rowB = arr2.length;
        int colA = arr1[0].length;
        int colB = arr2[0].length;
        int[][] arr3 = new int[rowA][colA];
        int sum = 0;
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                if(j == rowA-i-1){
                    System.out.println("iam j" + j);
                   sum += arr1[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
