class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums)
            set.add(n);
        
        int curr = 1;
        int longest = 0;
        
        for(int i =0; i<nums.length; i++){
            int curr_element = nums[i];
            curr = 1;
            
            if(!set.contains(curr_element - 1)){
                //by checking this condition we ensure that the 
                //curr_element is not already a part of a bigger 
                //sequence 
                
                int m = curr_element + 1;
                while(set.contains(m)){
                    //now we check if the next element is in set
                    //this is to check for a new start of a sequence
                    //and this will be the new start a sequence //other wise we wouldn't have entered this if condition
                    
                    m++;
                    curr++;
                    longest = Math.max(curr, longest);

                }
            }
        }
        
        return Math.max(longest, curr);
    }
}