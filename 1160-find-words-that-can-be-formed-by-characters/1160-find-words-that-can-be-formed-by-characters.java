class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        int [] frq = new int[32];
        for(char ch : chars.toCharArray()){
            frq[ch - 'a']++;
        }

        for(String str : words){
            int []tfr = new int[32];
            int f = 0;
            for(char ch : str.toCharArray()){
                tfr[ch - 'a']++;
                if(tfr[ch - 'a']>frq[ch - 'a']){
                    f = 1;
                    break;
                }
            }
            if(f==0)
                ans+=str.length();
        }
        return ans;
    }
}