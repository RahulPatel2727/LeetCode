class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer []> mp = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            Integer [] t = {nums1[i][0], nums1[i][1]};
            mp.put(nums1[i][0],t);
        }
        for (int i = 0; i < nums2.length; i++) {
            Integer [] t = {nums2[i][0], nums2[i][1]};
            int key = nums2[i][0];
            int val = nums2[i][1];
            if(mp.containsKey(key)) {
                Integer [] it = mp.get(key);
                int preVal = it[1];// pre value
                it[1] = preVal+val;
                mp.put(key,it);
            }
            else{
                mp.put(key,t);
            }
        }
        int [][] ans = new int[mp.size()][2];
        int itr = 0;
        for(Map.Entry<Integer, Integer[]> it : mp.entrySet()){
            ans[itr][0] = it.getValue()[0];
            ans[itr][1] = it.getValue()[1];
            itr++;
        }
        Arrays.sort(ans, Comparator.comparingInt(a -> a[0]));
        return ans;    
    }
}