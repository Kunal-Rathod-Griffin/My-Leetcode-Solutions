class Solution {
    public int minDistance(String word1, String word2) {
        
        int l1 = word1.length();
        int l2 = word2.length();
        
        int[][] cost = new int[l1+1][l2+1];
        
        for(int i =0; i<=l1; i++){
            cost[i][0] = i;
        }
        for(int i = 1; i<=l2; i++){
            cost[0][i] = i;
        }
        
        for(int i =0; i< l1; i++){
            for(int j = 0; j<l2; j++){
                if(word1.charAt(i) == word2.charAt(j))
                    cost[i+1][j+1] = cost[i][j];
                else{
                    int replace = cost[i][j];
                    int delete = cost[i][j+1];
                    int insert = cost[i+1][j];
                    
                    cost[i+1][j+1] = Math.min(replace, Math.min(delete, insert)) + 1;
                }
            }
        }
        
        return cost[l1][l2];
    }
}