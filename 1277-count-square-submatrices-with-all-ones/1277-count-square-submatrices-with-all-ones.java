class Solution {
    public int countSquares(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dp = new int[m+1][n+1];
        
        int result = 0;        
        
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                
                if(matrix[i][j] == 1 && i>0 && j >0){
                
                    matrix[i][j] = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1])) + 1;
                    
                }
                result += matrix[i][j];
                
                System.out.print(matrix[i][j]+ " ");
//                 if(matrix[i-1][j-1] == 1){
                    
//                     if(matrix[i-1][j] == 1 && matrix[i][j-1] == 1){
                        
//                     }
                    
//                 }
//                 else{
//                     dp[i][j] = matrix[i][j];
//                 }
                
            }
            
        }
        
        // for(int i =0; i<=m; i++){
        //     for(int j =0; j<=n; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        
        
        return result;
        
    }
}