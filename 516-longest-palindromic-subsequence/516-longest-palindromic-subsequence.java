/*
Memoization
*/

class Solution {
    public int longestPalindromeSubseq(String s) {
        
        Integer[][] memo = new Integer[s.length()][s.length()];
        return helper(s, 0, s.length()-1, memo);
    }
    
    public int helper(String s, int left, int right, Integer[][] memo){
        
        if(memo[left][right] != null)
            return memo[left][right];
        if(left > right) return 0;
        if(left == right) return 1;
        
        if(s.charAt(left) == s.charAt(right)) 
            memo[left][right] = 2 + helper(s, left + 1, right -1, memo);
        else{
            memo[left][right] = Math.max(helper(s, left, right -1, memo),
                                        helper(s, left+1, right, memo));
        }
        
        return memo[left][right];
    }
}