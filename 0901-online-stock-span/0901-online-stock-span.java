class StockSpanner {
    static Stack<Integer> st;
    static Stack<Integer> c;
    
    public StockSpanner() {
        st = new Stack<>();
        c = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!st.isEmpty() && !c.isEmpty() && price >= st.peek()){
            count += c.pop();
            st.pop();
        }
        st.push(price);
        c.push(count);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */