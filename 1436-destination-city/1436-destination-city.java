class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> mp = new HashMap<>();
        int f = -1, s = -1;
        for(List<String> str : paths){
            for(String it:str){
                mp.put(it,mp.getOrDefault(it,0)+1);
            }
        }
        for(List<String> l : paths){
            int i = 0;
            for(String str : l){
                if(mp.containsKey(str) && mp.get(str)==1 && i==1){
                    return str;
                }
                i++;
            }
        }
        return "";
        
    }
}