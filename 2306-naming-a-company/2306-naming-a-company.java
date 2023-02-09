class Solution {
    public long distinctNames(String[] ideas) {
        return count(ideas);
    }
    private static long count(String [] arr){
        Map<Character, HashSet<String>>mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<String> t = mp.get(arr[i].charAt(0));
            if(t!=null)
                t.add(arr[i].substring(1));
            else
                t = new HashSet<>(List.of(arr[i].substring(1)));
            mp.put(arr[i].charAt(0), mp.getOrDefault(arr[i].charAt(0),t));
        }
//        System.out.println(mp);
        long ans = 0;
        if(mp.size()==1){
            return 0;
        }
        HashSet<String> [] sets = new HashSet[mp.size()];
        int itr = 0;
        for (Map.Entry<Character, HashSet<String>> it : mp.entrySet()) {
            sets[itr] = it.getValue();
            itr++;
        }
        for (int i = 0; i < sets.length-1; i++) {
            HashSet<String>  set1 = sets[i];
            for (int j = i+1; j < sets.length; j++) {
                HashSet<String> set2 = sets[j];
                int c = 0;
                for(String st : set1){
                    if(set2.contains(st)){
                        c++;
                    }
                }
                int l1 = set1.size()-c;
                int l2 = set2.size()-c;
                ans += l1 * l2 * 2;
            }
        }
        return ans;
    }
}

// c ine 2 2 2

// c offee 2 2

// l offee 2 2 1
// s offee  2 2 1

// d onuts 3 2
// d emon  3 2

// t ime     3 2 
// t ruck    3 2