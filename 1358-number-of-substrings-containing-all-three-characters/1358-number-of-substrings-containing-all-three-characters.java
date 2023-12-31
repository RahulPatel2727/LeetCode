class Solution {
    public int numberOfSubstrings(String s) {
        return total(s.length()) - count(s,2);
    }
    static int count(String str, int k) {
        int n = str.length();
        Set<Character> set = new HashSet<>();
        int[] f = new int[3];
        int count = 0;
        int si = 0;
        for (int cur = 0; cur < n; cur++) {
            char curCh = str.charAt(cur);
            f[curCh - 'a']++;
            if (set.isEmpty()) {
                set.add(curCh);
            }
            if (!set.contains(curCh)) {
                set.add(curCh);
            }
            if (set.size() <= k) {
                count += cur - si + 1;
            }
            while (si <= cur && set.size() > k) {
                char siCh = str.charAt(si);
                f[siCh - 'a']--;
                if (f[siCh - 'a'] == 0) {
                    set.remove(siCh);
                }
                si++;
                if (set.size() <= k) {
                    count += cur - si + 1;
                }
            }
        }
        return count;
    }

    static int total(int len) {
        int sum = len;
        while(len-->0){
            sum+=len;
        }
        return sum;
    }
}