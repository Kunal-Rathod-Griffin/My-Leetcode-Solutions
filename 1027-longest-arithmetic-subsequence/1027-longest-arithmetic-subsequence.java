/*
nums = [3,6,9,12]
{}
{3=2}
{3=3, 6=2}
{3=4, 6=2, 9=2}

No one gave any dry run to this problem.

so for every index i we will check all the previous indexes and get their difference

for i = 0
it's 0

for i = 1
we will iterate i = 0
so we wil get 6 - 3 = 3 and length of diff 3 will be 2 {3,6}
so at tillI at i = 1 => {3=2}

for i = 2
we will iterate i = 0, 1
so for i = 0 the different is 6. there so we will put 6 = 2
for i = 1 the difference is 3. and for i = 1 in tillI length of diff 3 is 2 so now we will increment here
so at tillI at i = 2 => {3=3, 6=2}

for i = 3
we will iterate i = 0, 1, 2
for i = 2 the difference is 3. and at i = 2 in tillI for diff 3 length is 3 so here it will be 3 + 1= 4. 
and we will get tillI at i = 3 => {3=4, 6=2, 9=2}
*/


class Solution {
    public int longestArithSeqLength(int[] nums) {
        
//         int ansMax = 0, n = nums.length, was, diff;
        
//         HashMap<Integer, Integer> tillI[] = new HashMap[n];
        
//         for(int i =0; i<n; i++)
//             tillI[i] = new HashMap<>();
        
//         for(int i = 1; i<n; i++)
//             for(int j = 0; j<i; j++){
//                 diff = nums[i] - nums[j];
//                 was = tillI[j].getOrDefault(diff, 1);
//                 ansMax = Math.max(was + 1, ansMax);
//                 tillI[i].put(diff, was + 1);
//             }
        
//         for(int i =0; i<tillI.length; i++){
//             System.out.println(tillI[i]);
//         }
        
//          return ansMax;
                int n = nums.length;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        int maxValue = 1;
        
        for(int i=0;i<n;i++){
            int currElement = nums[i];
            dp[i] = new HashMap<>();
            HashMap<Integer, Integer> currMap = dp[i];
            
            for(int j=0;j<i;j++){
                int diff = nums[i] - nums[j];
                HashMap<Integer, Integer> prevMap = dp[j];
                int newValue = prevMap.getOrDefault(diff, 0)+1;
                currMap.put(diff, newValue);
                dp[i] = currMap;
                maxValue = Math.max(maxValue, newValue);
            }
        }
        return maxValue+1;

    }
}
