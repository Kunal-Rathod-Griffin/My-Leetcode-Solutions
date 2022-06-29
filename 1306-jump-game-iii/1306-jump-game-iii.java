class Solution {
    public boolean canReach(int[] arr, int start) {
        
        return helper(arr, start);
    }
    
    public boolean helper(int[] arr, int i){
        if( i>=0 && i<arr.length && arr[i]>=0)
        {
            arr[i] = - arr[i];
            return arr[i]==0 || helper(arr, i - arr[i]) || helper(arr, i + arr[i]);
        }
        return false;
    }
    
}