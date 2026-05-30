package recursion;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queen(board,0);
    }
    private static void display(boolean[][] board) {
        for(boolean[] nums : board){
            for(boolean num: nums){
                if(num){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static void queen(boolean[][] board, int r) {
        if(r == board.length){
            display(board);
            System.out.println();
            return;
        }
        for(int c=0;c<board.length;c++){
        if(isSafe(board,r,c)){
            board[r][c] = true;
            queen(board,r+1);
            board[r][c] = false;
        }

        }
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        for(int i=0;i<board.length;i++){
            if(board[i][c]){
                return false;
            }
        }
        int left = Math.min(r,c);
        for(int i=1;i<=left;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        int right = Math.min(r, board.length-c-1);
        for(int i=1;i<=right;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
