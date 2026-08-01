// Add Efficient code
// class MyStack {
//     Queue<Integer> q = new LinkedList<>();
//     public MyStack() {
        
//     }
    
//     public void push(int x) { //0(1)
//         q.add(x);
//     }
    
//     public int pop() { //0(n)
//         int n = q.size();
//         for(int i=0;i<n-1;i++){
//             q.add(q.remove());
//         }
//         return q.remove();
//     }
    
//     public int top() { //(n)
//         int n = q.size();
//         for(int i=0;i<n-1;i++){
//             q.add(q.remove());
//         }
//         int p = q.peek();
//         q.add(q.remove());
//         return p;
//     }
    
//     public boolean empty() {
//         return (q.size()==0);
//     }
// }


// Pop Efficient code
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) { //0(n)
       //Add at front of queue
       q.add(x);
       int n = q.size();
       for(int i=1;i<=n-1;i++){
        q.add(q.remove());
       }
    }
    
    public int pop() { //0(1)
        return q.remove();
    }
    
    public int top() { //(1)
        return q.peek();
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */