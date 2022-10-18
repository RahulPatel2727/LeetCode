class Solution {
    public String frequencySort(String s) {
//         this is also coppied
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // sort in max heap
        PriorityQueue<Character> maxHeap =
            new PriorityQueue<>((c1, c2) -> Integer.compare(map.get(c2), map.get(c1)));
        for(char c: map.keySet()) maxHeap.add(c);
        
        // build output
        StringBuilder output = new StringBuilder();
        while(maxHeap.size() > 0) {
            char c = maxHeap.poll();
            int count = map.get(c);
            for(int i = 0; i < count; i++) output.append(c);
        }
        
        return output.toString();
    }
}