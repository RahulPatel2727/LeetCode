class SeatManager {
    // static int [] seat;
    static int n;
    static PriorityQueue<Integer> q;

    public SeatManager(int n) {
        q = new PriorityQueue<>();
        this.n = 1;
    }
    
    public int reserve() {
        if(q.isEmpty()){
            // System.out.println(n);
            return n++;
        }else{
            int res = q.poll();
            return res;
        }
        
    }
    
    public void unreserve(int seatNumber) {
        q.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */