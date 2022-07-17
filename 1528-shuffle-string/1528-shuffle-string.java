class Solution {
    public String restoreString(String s, int[] indices) {
        
        String[] ans = new String[indices.length];
        int n = indices.length;
        for(int i=0; i<n; i++){
            
            
            System.out.println(s.charAt(indices[i]));
            ans[indices[i]] = Character.toString(s.charAt(i));
            // ans[i] = Character.toString(s.charAt(indices[i]));
        }
        
        String a = "";
        
        for(int i=0 ; i<n;i++){
            a+=ans[i];
        }
        
        return a;
        
    }
}