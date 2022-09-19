class Solution {
    public int longestPalindrome(String s) {
        int res=0;
      boolean odd=false;
      Map<Character, Integer> hashMap;
      hashMap=getFreq(s);
      
      for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
        if(entry.getValue()%2==0)
          res+=entry.getValue();
        else if(entry.getValue()>1 && (entry.getValue()-1)%2==0){
          res+=entry.getValue()-1;
          odd=true;
        } 
        else 
          odd=true; 
      }
      if(odd)
        res++;
      return res;
      
    }
  private Map<Character, Integer> getFreq(String s){
    Map<Character, Integer> hashMap=new HashMap<>();
    for(Character letter:s.toCharArray()){
        int freq=hashMap.getOrDefault(letter,0)+1;
        hashMap.put(letter, freq);
    }
    return hashMap;
  }
  
}