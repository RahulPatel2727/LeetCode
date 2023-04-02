class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int j = 0;
        for(int it : spells){
            int si = 0, ei = potions.length-1;
            while(si<=ei){
                int mid = si + (ei - si)/2;
                long prod = (long) it * potions[mid];
                if(prod >= success){
                    ei = mid - 1;
                }
                else{
                    si = mid + 1;
                }
            }
            spells[j++] = potions.length - si;
        }
        return spells;
    }
}