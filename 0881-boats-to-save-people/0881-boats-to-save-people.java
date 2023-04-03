class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int si = 0, ei = people.length - 1;
        while(si <= ei){
            if(people[si] + people[ei] <= limit){
                si++;
            }
            ei--;
            ans++;
        }
        return ans;
    }
}