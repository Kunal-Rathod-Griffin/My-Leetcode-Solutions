class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int min = Integer.MIN_VALUE;
        int count_min = 0;
        
        for(int i=0; i<nums.length ; i++){
            
            if(nums[i] >= min){
                min = nums[i];
                // System.out.println(min + " min value");
            }
            else{
                System.out.println(count_min + " count_min");
                count_min++;
            }
            
        }
        
        int min2 = Integer.MAX_VALUE;
        int count_max= 0;
        
        for(int i = nums.length -1; i>=0; i--){
            
            if(nums[i] <= min2){
                min2 = nums[i];
            }
            else{
                
                count_max++;
            }
        }
        
        
        System.out.println(count_min + " " + count_max);
        if(Math.min(count_min, count_max) >1)
            return false;
        return true;
    }
}