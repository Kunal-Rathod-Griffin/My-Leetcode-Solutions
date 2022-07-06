/*
Using dynamic programming for this approc

if there is 
1 1 
1 1 we will make it 1 1 
                    1 2 so now if there is another 1s like

1 1 0
1 2 1
1 1 1 we will make it to 

1 1 0
1 2 1
1 1 2 becuase we are doing min of i-1,j;  i, j-1; i-1, j-1;

*/


class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        
        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<= cols; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        
        
        
        
        return maxsqlen*maxsqlen;
    }
}