class Solution {
    public boolean canJump(int[] nums) {
        
        /*
        
        The idea is that we have overall maximum
        if we can't to the current if overall till now is less than
        value of the current index (i > max)
        
        if we can reach to current index or more 
        so now we are at current index. and we are calculating how far
        can we go from current index. (nums[i] + i)
        
        and we see the maximum between above and our overall maximum
        and make max = Math.max(nums[i] + i, max)
        
        
        
        */
        
        int max = 0;
        int n = nums.length;
        for(int i =0;i < n; i++){
            
            if(i > max)
                return false;
            max = Math.max(max, nums[i] + i);
            
        }
        
        return true;
        
    }
}