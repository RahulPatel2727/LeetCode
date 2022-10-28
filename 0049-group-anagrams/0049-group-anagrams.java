class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        String[] temp = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            temp[i]=strs[i];
        }
        for (int i = 0; i < temp.length; i++) {
            char[] ch = temp[i].toCharArray();
            Arrays.sort(ch);
            String st = String.valueOf(ch);
            temp[i] = st;
        }
        for (String st : temp) {
            System.out.print(st + " ");
        }
        System.out.println();
        for (int i = 0; i < strs.length; i++) {
            if (temp[i].equals( "-1")) {
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (int j =   i+1; j < strs.length; j++) {
                if (temp[j].equals(temp[i])) {
                    list.add(strs[j]);
                    temp[j] = "-1";
                }
            }
            res.add(list);
        }
        // System.out.println(res);
        // for(String i : temp){
        //     System.out.print(i+" ");
        // }
       return res;
    }
}