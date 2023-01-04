class Solution {
    public String oddString(String[] arr) {
        String ans = "";
        int temp = arr[0].length();
        Map<List<Integer>, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            List<Integer> ls = new ArrayList<>();
            for(int j=0; j<str.length()-1; j++){
                ls.add(str.charAt(j+1)-str.charAt(j));
            }
            if(map.containsKey(ls))
                map.put(ls,map.getOrDefault(ls,str)+str);
            else
                map.put(ls, str);
            
        }
        for(Map.Entry<List<Integer>, String > mp : map.entrySet()){
            if(mp.getValue().length() == temp)
                return mp.getValue();
        }
        return ans;
    }
}