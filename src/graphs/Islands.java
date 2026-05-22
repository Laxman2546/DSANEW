package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row =  row;
        this.col = col;
    }
}
public class Islands {
    public static void main(String[] args) {
        char[][] islands = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println(numIslands(islands));
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(grid[i][j] == '1' &&!vis[i][j]){
                    vis[i][j] = true;
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }

    private static  void bfs(int i,int j,char[][] grid,boolean[][] vis) {
        Queue <Pair> qu = new LinkedList<>();
        qu.add(new Pair(i,j));
        while(!qu.isEmpty()){
            Pair pop = qu.remove();
            int r = pop.row;
            int c = pop.col;
            if(r > 0){
                if(!vis[r - 1][c] && grid[r-1][c] == '1'){
                    vis[pop.row-1][pop.col] = true;
                    qu.add(new Pair(r-1,c));
                }
            }
            if(c < grid[0].length - 1){
                if(!vis[r][c + 1] && grid[r][c + 1] == '1'){
                    vis[pop.row][pop.col + 1] = true;
                    qu.add(new Pair(r,c + 1));
                }
            }
            if(c > 0){
                if(!vis[r][c - 1] && grid[r][c - 1] == '1'){
                    vis[pop.row][pop.col - 1] = true;
                    qu.add(new Pair(r,c - 1));
                }
            }
            if(r < grid.length - 1){
                if(!vis[r + 1][c] && grid[r+1][c] == '1'){
                    vis[pop.row+1][pop.col] = true;
                    qu.add(new Pair(r+1,c));
                }
            }
        }
    }
}
