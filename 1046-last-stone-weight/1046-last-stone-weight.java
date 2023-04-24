class Solution {
    public int lastStoneWeight(int[] stones) {
      if(stones.length < 2) return stones[0];
      PriorityQueue<Integer> que = new PriorityQueue<>(new custom());
      for(int x:stones) que.add(x);
      while(!que.isEmpty()){
          if(que.size() == 1) return que.poll();
          int k = que.poll();
          int j = que.poll();
          if(k==j) que.add(0);
          else{
              que.add(k-j);
          }
      }
      return 0;
    }
}
class custom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        return o1<o2?1:-1;
    }
}
