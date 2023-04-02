class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // my code
        Arrays.sort(potions);
        int p = potions.length, s = spells.length;
        for(int i=0;i<s; i++){
            int si = 0, ei = p-1;
            while(si <= ei){
                int mid = si + (ei - si) / 2;
                if(((long) spells[i] * potions[mid]) >= success){
                    ei = mid - 1;
                }
                else{
                    si = mid + 1;
                }
            }
            spells[i] = p - si;
        }
        return spells;
        
        
        // bad solution
		// Arrays.sort(potions);
		// TreeMap<Long, Integer> map = new TreeMap<>();
		// map.put(Long.MAX_VALUE, potions.length);
		// for (int i = potions.length - 1; i >= 0; i--) {
		// 	map.put((long) potions[i], i);
		// }
		// for (int i = 0; i < spells.length; i++) {
		// long need = (success + spells[i] - 1) / spells[i];
		// 	spells[i] = potions.length - map.ceilingEntry(need).getValue();
		// }
		// return spells;
        
    }
}