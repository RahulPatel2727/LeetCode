class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        char [] arr = s.toCharArray();
        
        String vo = "AEIOUaeiou";
        Set<Character> v = new HashSet<>();
        for(char ch : vo.toCharArray()){
            v.add(ch);
        }
        
        String vv = "";
        for(char it : arr){
            if(v.contains(it)){
                vv+=it;;
            }
        }
        char [] t = vv.toCharArray();
        Arrays.sort(t);
        int vit = 0;
        for(int i = 0; i<n;i++){
            if(v.contains(arr[i])){
                arr[i] = t[vit++];
            }
        }
        String ans = new String(arr);
        return ans;
    }
}