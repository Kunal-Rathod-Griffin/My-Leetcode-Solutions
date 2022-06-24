class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=  new PriorityQueue<>(Collections.reverseOrder());

        
        for(int i : nums){
            pq.add(i);
        }
        
        // while(pq.size() > 0){
        //     System.out.println(pq.remove());
        // }
        
        int n = pq.size();
        while(pq.size() > (n - k +1)){
            pq.remove();
        }
        
        return pq.peek();
        
    }
}