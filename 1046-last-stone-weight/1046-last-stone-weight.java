class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : stones){
            pq.add(i);
        }
        
        Iterator i = pq.iterator();
        
        
        while(pq.size() > 1){
            
            int a = pq.remove();
            int b = pq.remove();
            
            if(a == b)
                continue;
            if(a != b){
                
                pq.add(a < b ? (b-a) : (a - b));
                
            }
            
        }
        
        return (pq.peek()==null) ? 0 : pq.peek();
    }
}