class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int t = 0;
            for(char ch : bank[i].toCharArray()){
                t += Character.getNumericValue(ch);
            }
            if(t>0)
                l.add(t);
        }
        System.out.println(l);
        int ans = 0;
        for(int i=0;i<l.size()-1;i++){
            ans += l.get(i) * l.get(i+1);
        }
        return ans;
    }
}