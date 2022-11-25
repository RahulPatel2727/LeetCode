class Solution {
    public int mostFrequentEven(int[] A) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        int val=1000000,freq=0;
        for(var i:A){
            //if even element
            if(i%2==0){
                //increase frequency in map
                int curr= mp.getOrDefault(i,0)+1;
                mp.put(i,curr);
                //Update smallest with greatest frequency
                if(curr>freq || curr==freq && i<val){
                    val=i;
                    freq=curr;
                }
            }
        }
        return freq==0? -1 : val;
    }
}