class Solution {
    public int maxLength(List<String> arr) {
        List<String>res = new ArrayList<>();
        subseq(arr,"",res);
        int max = Integer.MIN_VALUE;
        for(int i = res.size()-1;i>=0;i--){
            boolean [] vis = new boolean[26];
            String str = res.get(i);
            boolean duplicate = false;
            for(int j = 0; j<str.length();j++){
                if(vis[str.charAt(j)-'a']){
                    duplicate = true;
                    break;
                }
                else {
                    vis[str.charAt(j)-'a']=true;
                }
            }
            if(!duplicate){
               max = Math.max (max,str.length());
            }
        }
        return max;
    }
    public static void subseq(List<String> qus, String ans,List<String>res){
        if(qus.size()==0){
            res.add(ans);
            return;
        }
        String temp = qus.remove(0);
        subseq(qus,ans,res);
        subseq(qus,ans+temp,res);
        qus.add(temp);
    }
}