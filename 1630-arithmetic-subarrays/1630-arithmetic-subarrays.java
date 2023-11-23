class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int nl = l.length;
        for(int i=0;i<nl;i++){
            
            PriorityQueue<Integer> q = new PriorityQueue<>();
            for(int j = l[i]; j<=r[i];j++){
                q.offer(nums[j]);
            }
            
            int a = q.poll();
            int b = q.poll();
            int dif = a - b;
            int f = 0;

            while(!q.isEmpty()){                
                int c = q.poll();
                if(b - c != dif){
                    ans.add(false);
                    f = 1;
                    break;
                }else{
                    b = c;
                }
            }
            if(f == 0){
                ans.add(true);
            }
        }
        return ans;
    }
}