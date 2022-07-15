class Solution {
    
    int maxcurr;
    public int maxAreaOfIsland(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int maxtillnow = 0;
        
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                
                if(grid[i][j] == 1){
                    maxcurr= 0;
                    helper(grid, i, j);
                    maxtillnow = Math.max(maxtillnow, maxcurr);
                }
                
            }
        }
        
        return maxtillnow;
    }
    
    public void helper(int[][] grid, int i,  int j){
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        if(grid[i][j] == 0)
            return;
        
        maxcurr++;
        grid[i][j] = 0;
        
        helper(grid, i, j + 1);
        helper(grid, i, j - 1);
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        
    }
}