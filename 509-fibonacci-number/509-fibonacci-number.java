class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;
        
        int prev = 0;
        int curr = 1;
        
        while(n>1){
            int sum = curr+prev;
            prev = curr;
            curr=sum;
            n--;
        }
        
        return curr;
    }
}