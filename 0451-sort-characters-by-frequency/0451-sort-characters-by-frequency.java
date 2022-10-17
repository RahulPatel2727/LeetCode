class Solution {
    public String frequencySort(String s) {
        String str = s;
        String [] a = new String[26];
        String [] A = new String[26];
        String [] num = new String[10];
        for(int i = 0; i<26 ; i++){
            if(i<10){
                num[i]="";
            }
            a[i]="";
            A[i]="";
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                A[ch-'A'] += ch;
            }
            else if(Character.isLowerCase(ch)){
                a[ch-'a'] += ch;
            }
            else{
                 num[ch-'0'] += ch;
            }
        }

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++) {
            if(a[i].length()>0)
                map.put(a[i], a[i].length());
        }

        for (int i = 0; i < A.length; i++){
            if(A[i].length()>0)
                map.put(A[i],A[i].length());
        }

        for(int i=0;i<num.length;i++) {
            if(num[i].length()>0)
                map.put(num[i], num[i].length());
        }
        int len = map.size();
        String res = "";
        for (int i = 0; i < len; i++) {
            String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            res += key;
            map.remove(key);
        }
        return res;
    }
}