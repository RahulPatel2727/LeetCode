class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String>ans=new ArrayList<>();
        partitioning(s,ans,list);
        return list;
    }
    public static void partitioning(String ques, List<String> ans,List<List<String>> list){
        if(ques.length()==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0,cut);
            if(isPalindrome(s)) {
                ans.add(s);
                partitioning(ques.substring(cut),ans,list);
                ans.remove(ans.size()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String str){
        int st=0, en = str.length()-1;
        while(st<=en){
            if(str.charAt(st)!=str.charAt(en)){
                return false;
            }
            st++;en--;
        }
        return true;
    }
}