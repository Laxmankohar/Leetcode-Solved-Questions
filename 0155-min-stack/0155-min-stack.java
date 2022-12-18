class MinStack {
    
    Stack<Integer> s1 = null;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        s1 = new Stack<>();
    }
    
    public void push(int val) {
       if(val <= min){
          s1.push(min);
           min = val;
       }
        s1.push(val);
    }
    
    public void pop() {
        if(s1.pop() == min){
            min = s1.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */