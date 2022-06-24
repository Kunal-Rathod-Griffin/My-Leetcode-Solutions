class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i: nums){
            
            if(pq.size()< 2)
                pq.add(i);
            else{
                pq.add(i);
                pq.remove(); 
            }
            
        }
        
        int x = pq.peek() -1;
        pq.remove();
        
        return (pq.peek()-1)*x;
    }
}