class RecentCounter {
        
    LinkedList<Integer> output;
    
    public RecentCounter() {
        this.output = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.output.addLast(t);
        
        
        while(this.output.getFirst() < t - 3000){
            this.output.removeFirst();
        }
        return this.output.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */