class MyQueue {
 Stack<Integer> st;
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();
        while(!st.isEmpty()){
            tmp.push(st.pop());
        }
        st.push(x);
        while(!tmp.isEmpty()){
            st.push(tmp.pop());
        }
        
    }
    
    public int pop() {
       return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
