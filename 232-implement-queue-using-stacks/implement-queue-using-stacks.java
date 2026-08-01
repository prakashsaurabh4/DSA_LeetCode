//Add Efficient approach
// class MyQueue {
//     Stack<Integer> st = new Stack<>();
//     Stack<Integer> helper = new Stack<>();
//     public MyQueue() {
        
//     }
    
//     public void push(int x) { //0(1)
//         st.push(x);
//     }
    
//     public int pop() { //0(n)
//         // remove bottom from stack
//         while(st.size()>1){
//             helper.push(st.pop());
//         }
//         int front = st.pop();
//         while(helper.size()>0){
//             st.push(helper.pop());
//         }
//         return front;
//     }
    
//     public int peek() {  // 0(n)
//         //print bottom from stack
//          while(st.size()>1){
//             helper.push(st.pop());
//         }
//         int front = st.peek();
//         while(helper.size()>0){
//             st.push(helper.pop());
//         }
//         return front;
//      }
    
//     public boolean empty() {
//         return (st.size()==0);
//     }
// }


//pop Efficient approach
class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) { //0(1)
        //push at bottom
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }
    
    public int pop() { //0(1)
        return st.pop();
    }
    
    public int peek() {  // 0(1)
        return st.peek();
     }
    
    public boolean empty() {
        return (st.size()==0);
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