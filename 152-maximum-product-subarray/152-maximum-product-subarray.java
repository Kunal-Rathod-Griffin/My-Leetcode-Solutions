/*
So basically we are saying that the final answer will start from either left-most[0] or right index[n-1]. 

This is because assume we have an answer (maximum multiplication) in between then we will have something like this:


Proof by contradiction:
left (ans) right;

so now we will consider all the cases
+ (ans) + 
+ (ans) -
- (ans) +
- (ans) -
here ans can have two possiblitlies + or -

when ans = +ve
+ (ans) + here we can simply multilply left and right and can get           bigger ans
+ (ans) - here multiply left
- (ans) + here mltiply right
- (ans) - here multiply both and you will have a bigger ans

when ans= -ve
+ (ans) + if ans is -ve then why select it as answer, just select           left or right (which ever is bigger) that will be our             ans 
+ (ans) - here multiply to left and then right
- (ans) + here multiply to right and then left
- (ans) - here multiply to either left or right which ever makes it bigger


*/





class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length, res = nums[0];
        int left = 0, right  = 0;
        
        for(int i = 0; i<n; i++){
            
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[n - 1 - i];
            
            res = Math.max(res, Math.max(left, right));
        }
        
        return res;
    }
}