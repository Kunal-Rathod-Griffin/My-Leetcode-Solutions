class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        
        int rowStart = 0;
        int rowEnd = matrix.length -1;
        int columnStart = 0;
        int columnEnd = matrix[0].length -1;
        
        
        while(rowStart<=rowEnd && columnStart<=columnEnd ){
        
        for(int i = columnStart; i<=columnEnd; i++){
            ans.add(matrix[rowStart][i]);
        }
        rowStart++;
        System.out.println("rowStart = " + rowStart);
            
        for(int i =rowStart; i<=rowEnd; i++){
            ans.add(matrix[i][columnEnd]);
        }
        columnEnd--;
        System.out.println("columnEnd = " + columnEnd);
        
        if(rowStart <= rowEnd){
            
        for(int i = columnEnd; i>=columnStart; i--){
            ans.add(matrix[rowEnd][i]);
        }
        rowEnd--;
        }
            
            
        System.out.println("rowEnd = " + rowEnd);
        
        if(columnStart <= columnEnd){    
        for(int i = rowEnd; i>=rowStart; i--){
            ans.add(matrix[i][columnStart]);
        }
        columnStart++;
        }
        System.out.println("columnStart = " + columnStart);
        }
        
        return ans;
    }
}