import java.util.*;
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> win = new HashSet<>();
        Map<Integer,Integer> lose = new HashMap<>();
        for(int [] it : matches){
            int w = it[0];
            win.add(w);
        }
        for(int []it:matches){
            int l = it[1];
            int w = it[0];
            lose.put(l,lose.getOrDefault(l,0)+1);
            if(win.contains(l)) win.remove(l);
        }
        List<Integer> fst = new ArrayList<>(win);
        List<Integer> sec = new ArrayList<>();
        
        for(Integer key : lose.keySet()){
            int f = lose.get(key);
            if(f==1){
                sec.add(key);
            }
        }
        
        Collections.sort(fst);
        Collections.sort(sec);
        
        ans.add(fst);
        ans.add(sec);
        return ans;
    }
}