class Solution {
    public int maxArea(int[] height) {
        
        int i =0;
        int j = height.length - 1;
        
        int max = Integer.MIN_VALUE;
        
        while(i < j){
            
            int curr = Math.min(height[i], height[j]) * (j - i);
            
            if(curr>max)
                max = curr;
            
            if(height[i] > height[j]) j--;
            else i++;
        }
        
        return max;
    }
}