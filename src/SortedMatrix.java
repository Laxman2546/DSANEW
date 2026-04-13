public class SortedMatrix {
    public   static boolean searchMatrix(int[][] mat, int target){
        int row = mat.length-1;
        int col = mat[0].length-1;
        int start = mat[0][0];
        int end = mat[row][col];
        while(start <= end){
        int mid = start + (end - start) /2;
        System.out.println(mid);
        if(mid < target){

        }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target  = 3;
        searchMatrix( mat,  target);
    }
}
