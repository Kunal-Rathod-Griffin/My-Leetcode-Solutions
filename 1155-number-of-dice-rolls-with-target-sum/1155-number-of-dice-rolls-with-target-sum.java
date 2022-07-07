class Solution {
    public int numRollsToTarget(int n, int k, int target) {
    
        Integer[][] mem = new Integer[n+1][target+1];
        return helper(n, k, target, mem);
    }
    
    public int helper(int n, int k, int target, Integer[][] mem){
        if(n==0||target<0) return target==0?1:0;
        
        if(mem[n][target] != null) return mem[n][target];
        
        int ans = 0;
        
        for(int i = 1; i<=k; i++){
            ans = (ans + helper(n-1, k, target - i, mem))%1000000007;
        }
        mem[n][target] = ans;
        return ans;
        
        
        
    }
    
    
}