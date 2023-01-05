class KthLargest {
    
    Queue<Integer> q;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        q = new PriorityQueue<>();
        for(int i =0; i<nums.length;i++){
            q.add(nums[i]);
            
            if(q.size() > k){
                q.poll();
            }
        }
        
    }
    
    public int add(int val) {
        q.add(val);
        
        if(q.size() == k +1){
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */