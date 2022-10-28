class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            list.add(words[i]);
            int st = i+1;
            char [] ch1 = words[i].toCharArray();
            Arrays.sort(ch1);
            String temp1 = String.valueOf(ch1);
            while(st<words.length){
                char [] ch2 = words[st].toCharArray();
                Arrays.sort(ch2);
                String temp2 = String.valueOf(ch2);
                if (!temp1.equals(temp2)){
                    break;
                }
                st++;
                i++;
            }
        }
        return list;
    }
}