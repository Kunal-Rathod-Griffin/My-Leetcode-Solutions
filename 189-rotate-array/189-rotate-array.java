class Solution {
    public void rotate(int[] nums, int k) {
        
        
        k = k %nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length -1);
        
    }
    
    public void reverse(int[] nums, int left, int right){
        
        int i = left;
        int j = right;
        
        while(i< j){
            
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
            
        }
        
    }
    
}