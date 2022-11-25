class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(i%2==0)
                map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int res = -1;
        int max = -1;
        
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            int num = mp.getKey();
            int frq = mp.getValue();
            if(max<frq){
                max = frq;
                res = num;
            }
            else if(max == frq){
                res = Math.min(res, num);
            }
            
        }
        if(res>=0)
            return res;
        else
            return -1;
    }
}