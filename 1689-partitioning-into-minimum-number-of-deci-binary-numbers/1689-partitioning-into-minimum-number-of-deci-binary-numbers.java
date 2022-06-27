class Solution {
    public int minPartitions(String n) {
        
        
        char max = '0';
        for(int i= 0; i< n.length(); i++){
        
            char s  = n.charAt(i);
            if(s > max) max = s;
        }
        
        return max - '0';
        
    }
}