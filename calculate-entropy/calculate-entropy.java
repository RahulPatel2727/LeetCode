class Solution {
    public static double calculateEntropy(int[] group) {
        int totalValues = group.length;

        // Calculate the frequency of each value in the group
        Map<Integer, Integer> valueCounts = new HashMap<>();
        for (int value : group) {
            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
        }

        // Calculate the probability and entropy for each value
        double entropy = 0;
        for (int value : valueCounts.keySet()) {
            int count = valueCounts.get(value);
            double probability = (double) count / totalValues;
            entropy -= probability * log2(probability);
        }

        return entropy;
    }

    public static double log2(double value) {
        return Math.log(value) / Math.log(2);
    }
}