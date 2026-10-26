class Pair {
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    int[] delRow = { -1, 0, 1, 0 };
    int[] delCol = { 0, 1, 0, -1 };
    public int countIslands(int[][] grid, int k) {
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] vis = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && !vis[i][j]) {
                    if (solve(grid, i, j, k, vis)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean solve(int[][] grid, int row, int col, int k, boolean[][] vis) {
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(row, col));
        vis[row][col] = true;
        int current = grid[row][col];
        long sum = current;
        int m = grid.length;
        int n = grid[0].length;
        while (!qu.isEmpty()) {
            Pair popped = qu.poll();
            for (int i = 0; i < 4; i++) {
                int nRow = delRow[i] + popped.row;
                int nCol = delCol[i] + popped.col;
                if (nRow >= 0 && nRow < m && nCol >= 0 && nCol < n && grid[nRow][nCol] != 0 && !vis[nRow][nCol]) {
                    qu.add(new Pair(nRow, nCol));
                    vis[nRow][nCol] = true;
                    sum += grid[nRow][nCol];
                }
            }
        }
        return sum % k == 0;
    }
}