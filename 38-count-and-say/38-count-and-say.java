class Solution {
    public String countAndSay(int n) {
                
        String ans = "1";
        for(int i =1; i<n; i++){
            ans = helper(ans);
        }
        
        return ans;
    }
    
     public String helper(String prev){
        String ans = "";
        
       
        
        Character last = prev.charAt(0);
        int last_cnt = 1;
        
        for(int i =1; i<prev.length(); i++){
            
            if( prev.charAt(i) == last ){
                
                // last= Character.toString(prev.charAt(i));
                last_cnt ++;
            }
            else{
                
                ans += Integer.toString(last_cnt);
                ans+= Character.toString(last);
                last = prev.charAt(i);
                last_cnt = 1;
                
            }
            
        }
         
        ans += Integer.toString(last_cnt);
        ans+= Character.toString(last);
        return ans;

    }
}