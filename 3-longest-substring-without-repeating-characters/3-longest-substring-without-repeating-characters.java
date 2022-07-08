class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        
        if(s.isEmpty())
            return 0;
        
        
        int left = 0;
        Character right;
        int maxtillnow = 1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            right = s.charAt(i);
            if(map.containsKey(right) && left <= map.get(right) ){
                maxtillnow = Math.max(maxtillnow, i - left);
                int l = map.get(right);
                left = l + 1;
                
            }
            else{
                maxtillnow = Math.max(maxtillnow, i - left+1);
            }
            map.put(right, i);
        }
        
        return maxtillnow;
        
    }
}