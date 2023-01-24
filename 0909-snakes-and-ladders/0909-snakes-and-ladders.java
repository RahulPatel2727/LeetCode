class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int start = n * n;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if ((n-i) % 2 == 0) {
                   hm.put(start, board[i][j]);
                } else {
                   hm.put(start, board[i][n - j - 1]);
                }
                start--;
            }
        }
        // breadth-first-search
        Queue<Integer> queue = new LinkedList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        queue.add(1);
        hs.add(1);  // For visited  cells
        int step = 0; 
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int current = queue.poll();
                if (current == n * n)  {    // Reached the top! winner winner chicken dinner 
                    return step;
                }
                for(int j = 1; j <= 6; j++){
                    int newPoint = current + j;
                    if (newPoint > n * n){ 
                        continue;       // We are outside the board now with this choice
                    }
                    if(hm.get(newPoint) != -1){
                        newPoint = hm.get(newPoint);    // Either snake or ladder (doesn't matter)
                    }
                    if(!hs.contains(newPoint)){
                        queue.add(newPoint);
                        hs.add(newPoint);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}