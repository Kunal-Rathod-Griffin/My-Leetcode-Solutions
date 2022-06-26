class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
//         int right = cardPoints.length -1;
//         int left = right - k +1 ;
//         int max = 0;
//         for(int i =left; i<= right; i++){
//             max += cardPoints[i];
//         }
        
//         int left_sum = 0;
//         int right_sum = max;
        
//         int length = cardPoints.length - 1;
//         for(int i =0; i<k && i < length ; i++){
//             left_sum += cardPoints[i];
            
//             right_sum -= cardPoints[length  - k  + i ];
            
//             max = Math.max(max, left_sum + right_sum);
//         }
        
//         return max;
           
        int n = cardPoints.length, lSum = 0;
        for(int i = 0; i < k; ++i){
            lSum += cardPoints[i];
        }
        int max = lSum;
        for(int rSum = 0, i = 0; i < k; ++i){
            rSum += cardPoints[n-1-i];
            lSum -= cardPoints[k-1-i];
            max = Math.max(max,lSum+rSum);
        }
        return max;

    }
}