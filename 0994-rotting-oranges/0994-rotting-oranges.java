class Solution {

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    dfs(grid, i, j, 2);
                }
            }
        }

        int max = 2;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1) return -1;
                max = Math.max(max, grid[i][j]);
            }
        }

        return max - 2;
    }

    private void dfs(int[][] grid, int r, int c, int time){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length
           || grid[r][c]==0 || (grid[r][c]>1 && grid[r][c]<time)) return;

        grid[r][c] = time;

        dfs(grid, r+1, c, time+1);
        dfs(grid, r-1, c, time+1);
        dfs(grid, r, c+1, time+1);
        dfs(grid, r, c-1, time+1);
    }
}