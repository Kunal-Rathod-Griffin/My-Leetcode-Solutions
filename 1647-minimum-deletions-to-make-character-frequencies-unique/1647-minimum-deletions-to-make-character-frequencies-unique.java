class Solution {
    public int minDeletions(String s) {
        
        int[] fre = new int[26];
        
        for(int i =0; i< s.length(); i++){
            fre[s.charAt(i) - 'a'] += 1;
        }
        
        int del = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0; i< 26; i++){
            
            while(fre[i] > 0 && set.contains(fre[i])){
                fre[i] --;
                del++;
                
            }
            set.add(fre[i]);
        }
        
        return del;
        
    }
}