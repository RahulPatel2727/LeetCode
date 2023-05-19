class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length;i++){
            min = Math.min(min, Math.abs(arr[i] - arr[i-1]));
        }
        for(int i = 1;i<arr.length;i++){
            if(min == Math.abs(arr[i]-arr[i-1])){
                ans.add(new ArrayList<>(Arrays.asList(arr[i-1],arr[i])));
            }
        }
        System.out.println(min);
        return ans;
    }
}