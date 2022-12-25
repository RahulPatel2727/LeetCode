class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int q=0;q<queries.length;q++){
            int val = queries[q];
            int sum = 0;
            int c = 0;
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                c++;
                if(sum>val){
                    queries[q] = i;
                    break;
                }
                else if(sum == val){
                    queries[q] = i+1;
                    break;
                }
                else if(i==nums.length-1 && sum < val){
                    queries[q] = i+1;
                }
            }
        }
        return queries;
    }
}