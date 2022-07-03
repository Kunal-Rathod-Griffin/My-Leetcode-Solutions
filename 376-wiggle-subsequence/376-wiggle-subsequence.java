class Solution {
    public int wiggleMaxLength(int[] nums) {
        
//         int n = nums.length - 1;
        
//         int[] diff = new int[n-1];
        
//         for(int i =0; i<n-1; i++){
//             diff[i] = nums[i+1] - nums[i];
//         }
        
//         int ans = nums.length;
        
//         Boolean is_positive = null;
        
//         for(int i =0; i<diff.length; i++){
            
//             if(diff[i] == 0)
//             {
//                 ans--;
                 
//             }
//             else if(is_positive == null){
//                 is_positive = diff[i] > 0;
                 
//             }
            
//             else if((diff[i]>0 && is_positive) || (diff[i]<0 && !is_positive)){
//                 ans--;
                 
//             }
//             else{
//                 is_positive = !is_positive;
//             }
            
            
//         }
        
//         return ans;
    if (nums.length <= 1) return nums.length;
    
    int count = nums.length;
    Boolean positive = null;
    
    for (int i = 0; i < nums.length-1; i++){
        int temp = nums[i+1] - nums[i];
        if (temp == 0) count--;
        else if (positive == null) positive = temp > 0;
        else if ((temp > 0 && positive) || (temp < 0 && !positive))
            count--;
        else
            positive = !positive;
    }
    return count;

    }
}