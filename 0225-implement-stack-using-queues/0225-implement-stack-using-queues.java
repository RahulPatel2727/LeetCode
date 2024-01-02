class MyStack {
    Queue2 q;
    Queue2 t;
    public MyStack() {
        q = new Queue2(100);
        t = new Queue2(100);
    }
    
    public void push(int x) {
        t.push(x);
        for(int i=q.f; i<q.r;i++){
            t.push(q.pop());
        }
        for(int i=t.f;i<t.r;i++){
            q.push(t.pop());
        }
    }
    
    public int pop() {
        return q.pop();
    }
    
    public int top() {
        return q.top();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
class Queue2{
    int f, r, n, eCount=0;
    int []arr;
    Queue2(int size){
        arr = new int[size];
        f = 0; r = 0; n = size;
    }
    void push(int val){
        if(eCount < n){
            arr[r] = val;
            r++;
            eCount++;
        }
    }
    int pop(){
        if(eCount>0) {
            int d = arr[f];
            f++;
            eCount--;
            return d;
        }
        return 0;
    }
    int top(){
        return arr[f];
    }
    boolean isEmpty(){
        return eCount == 0;
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