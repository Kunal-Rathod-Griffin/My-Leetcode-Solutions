class Solution {
    public String restoreString(String s, int[] indices) {
        
        int n = indices.length;
        char[] ans = new char[indices.length];
        
        for(int i=0; i<n; i++){
            ans[indices[i]] = s.charAt(i);
        }
        
        String ret = new String(ans);
        
        return ret;
         
    }
}