class Solution {
    public int numberOfSubstrings(String s) {
        return total(s.length()) - count(s,2);
    }
    static int count(String str, int k){
        int n = str.length();
        Set<Character> set = new HashSet<>();
        int []f = new int[3];
        int count = 0; int sum = 0;
        int si = 0;
        for(int cur = 0; cur<n; cur++){
            char curCh = str.charAt(cur);
            f[curCh - 'a']++;
            if(set.isEmpty()){
                set.add(curCh);
                sum++;
                count += 1;
                continue;
            }
            if(!set.contains(curCh)){
                set.add(curCh);
                sum++;
            }
            if(sum <= k){
                count+=cur - si + 1;
            }
            while (si <= cur && set.size() > k) {
                char siCh = str.charAt(si);
                f[siCh-'a']--;
                if(f[siCh-'a']==0){
                    sum--;
                    set.remove(siCh);
                }
                si++;
                if(sum<=k){
                    count+= cur - si + 1;
                }
            }
        }
        return count;
    }
    static int total(int len){
        int sum = len;
        while(len-->0){
            sum += len;
        }
        return sum;
    }
}