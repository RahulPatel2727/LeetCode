class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int it : nums){
            set.add(it);
        }
        // we are catching the tail or starting point of the longest consecutive sequence
        int max = 0;
        for(int it : set){
            if(!set.contains(it - 1)){
                int cNo = it;
                int tMax = 1;
                while(set.contains(cNo+1)){
                    cNo++;
                    tMax++;
                }
                max = Math.max(max,tMax);
            }
        }
        return max;
    }
}