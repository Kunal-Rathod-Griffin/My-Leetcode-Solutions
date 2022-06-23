class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // int n = target.length -1;
        // int i =0;
        // boolean found  = false;
        // int index = -1;
        // int start = -1;
        // int end = target.lenght -1;
        // int midd
        
        // if(!found){
        //     return -1;
        // }
        
        int i = 0;
        int n = nums.length -1;
        
        int index = binarySearch(nums, target, i , n);
        int[] ans= new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(index == -1)
            return ans;
        
        ans[0] = index;
        ans[1] = index;
        int left_index = index -1;
        while(true){
            int left = binarySearch(nums, target, 0, left_index);
            if(left == -1)
                break;
            
            
            ans[0] = left;
            left_index --;
            
        }
        
        
        int right_index = index + 1;
        while(true){
            
            int right = binarySearch(nums, target, right_index, n);
            if(right == -1)
                break;
            ans[1] = right;
            right_index++;
        }
        
        return ans;
        
        
    }
    
    public int binarySearch(int[] nums, int target, int left, int right)    {
        if(left > right)
            return -1;
        int mid = (left+ right)/2;
        int curr= nums[mid];
        
        if(curr== target)
            return mid;
        
        if(curr > target)
            return binarySearch(nums, target, left, mid -1);
        else
            return binarySearch(nums, target, mid+1, right);
             
    }
    
}