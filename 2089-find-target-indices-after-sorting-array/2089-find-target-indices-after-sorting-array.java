class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        //traverse through the array
        //count the number of occurence of target
        //count the numbers that are smaller then target
        //so at the end if 3 number are samller than target
        //then start index of ans will be 4 and we will increment 
        //4 until it's occurence
        //so if target is two times then ans will be {4, 5}
        
        int smaller = 0;
        int count = 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target)
                count++;
            if(nums[i] < target)
                smaller++;
        }
        
        
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i =0; i<count; i++){
            ans.add(smaller++);
        }
        
        return ans;
    }
}