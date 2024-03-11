import java.util.HashMap;

class Solution {
    public String customSortString(String order, String s) {
        // Create a hashmap to store the count of each character in s
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (countMap.containsKey(c)) {
                int count = countMap.get(c);
                while (count-- > 0) {
                    result.append(c);
                }
                countMap.remove(c);
            }
        }
        
        for (char c : countMap.keySet()) {
            int count = countMap.get(c);
            while (count-- > 0) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
