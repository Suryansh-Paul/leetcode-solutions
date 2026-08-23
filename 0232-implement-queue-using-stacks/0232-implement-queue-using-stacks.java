class MyQueue {
    Stack<Integer> instack = new Stack<>() ;
    Stack<Integer> outstack = new Stack<>() ;
    private void transfer(){

       if(outstack.isEmpty()){
        while(!instack.isEmpty()){
            outstack.push(instack.pop());
        }
       }


    }
    public MyQueue() {
        
    }
    
    public void push(int x) {
        instack.push(x);
    }
    
    public int pop() {
        transfer();
        return outstack.pop();
    }
    
    public int peek() {
        transfer();
        return outstack.peek();
    }
    
    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();
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