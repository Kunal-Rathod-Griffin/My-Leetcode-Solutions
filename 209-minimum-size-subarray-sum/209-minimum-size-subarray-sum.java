class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
/*
below solution is for when we need exact sum to be target 
here it is more than equal to target
*/
        
//         Map<Integer, Integer> sumI = new HashMap<>();
        
//         int smallest = Integer.MAX_VALUE;
//         int curr_sum = 0;
//         for(int i = 0; i<nums.length; i++){
//             curr_sum+=nums[i];
            
//             if( curr_sum - target >= 0){
//                 int diff = curr_sum - target;
//                 if(sumI.containsKey(diff)){
//                     System.out.println(diff +" "+ i);
//                     smallest = Math.min(smallest, i - sumI.get(diff) );
//                 }
                
//             }
//             sumI.put(curr_sum, i);
//         }
        
//         System.out.println(sumI);
        
//         if(smallest == Integer.MAX_VALUE)
//             return 0;
//         else
//             return smallest;
        
        int n = nums.length;
        if(n == 0) return 0;
        
        int sum = nums[0];
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        
        while(end < n){
            if(sum < target){
                ++end;
                if(end == n) break;
                sum += nums[end];
            } else{
                minLen = Math.min(minLen, end  - start + 1);
                sum-=nums[start];
                ++start;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}