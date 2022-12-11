class Solution {
    private int[] preSum;
    private Integer[][] mem;
    
    public int stoneGameVII(int[] stones) {
        int size = stones.length;
        preSum = new int[size + 1];
        mem = new Integer[size][size];
        
        for(int i = 0; i < size; i++) // Calculating prefix sum
            preSum[i + 1] = preSum[i] + stones[i];
        
        return playTurn(stones, 0, size - 1);
    }
    
    private int getScore(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
    
    private int playTurn(int[] stones, int left, int right) {
        if (left > right) return 0;
        
        if(mem[left][right] != null) return mem[left][right];
        
        int lScore = getScore(left + 1, right) - playTurn(stones, left + 1, right);
        int rScore = getScore(left, right - 1) - playTurn(stones, left, right - 1);
        
        mem[left][right] = Math.max(lScore, rScore);
        
        return mem[left][right];
    }
}