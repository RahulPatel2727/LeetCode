class Solution {
    public static String answer;
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(String it : nums){
            set.add(it);
        }
        ans(nums[0].length(),"",set);
        return answer;
    }
    public static void ans(int len, String ans,Set<String>set){
        if(len==0){
            if(!set.contains(ans)){
                answer = ans;
            }
            return;
        }
        ans(len-1,ans+"0",set);
        ans(len-1,ans+"1",set);
    }
}