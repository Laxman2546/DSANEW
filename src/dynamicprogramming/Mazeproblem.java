package dynamicprogramming;

public class Mazeproblem {
    public static void main(String[] args) {
        int row = 4;
        int col = 7;
        uniquepath(row,col);
            boolean[][] maze =  {
                    {true,true,true},
                    {true,false,true},
                    {true,true,true},
                    };
            System.out.println(uniqueobstacles(maze,0,0,0));
    }

    private static int uniquepath(int row,int col) {
        if(row == 1 ||col==1){
            return 1;
        }
        int rightCount = uniquepath(row,col-1);
        int downCount = uniquepath(row-1,col);
        return rightCount + downCount;
    }
    private static int uniqueobstacles(boolean[][] maze,int row,int col,int count) {
        if(maze.length == 1 || maze[0].length == 1){
            return 1;
        }
        if(!maze[row][col]){
            return 0;
        }
        if(col < maze[0].length-1){
        count += uniquepath(row,col+1);
        }
        if(row < maze.length-1){
        count += uniquepath(row+1,col);
        }
        return count;
    }
}
