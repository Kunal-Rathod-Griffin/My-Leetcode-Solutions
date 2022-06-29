class Solution {
    public int jump(int[] nums) {
        
        int max = 0;
        int count = 0;
        int current_end = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            
            int curr = nums[i] + i;
            max = Math.max(max, curr);
            
            if(i == current_end){
                count ++;
                current_end = max;
            }    
            
        }
        
        return count;
        
    }
}