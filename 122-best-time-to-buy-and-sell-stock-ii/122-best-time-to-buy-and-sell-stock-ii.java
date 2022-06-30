class Solution {
    public int maxProfit(int[] prices) {
        
        int maxCur = 0;
        int maxSoFar = 0;
        
        for(int i =1; i<prices.length; i++){
            
            // m += prices[i] - prices[i-1];
            // maxCur = Math.max(0, maxCur);
            int curNow = maxCur + (prices[i] - prices[i-1]);
            if(curNow > maxCur) {
                maxCur = curNow;
                
            }
            else{
                maxSoFar += maxCur;
                maxCur = 0;
                
            }
        
            
        }
         
        return maxSoFar +maxCur;
    }
}