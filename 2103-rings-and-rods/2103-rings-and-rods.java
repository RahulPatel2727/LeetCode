class Solution {
    public int countPoints(String rings) {
        String str = rings;
        Set<Integer> r = new HashSet<>();
        Set<Integer> g = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for(int i=0;i<str.length()-1;i += 2){
            int rod = Character.getNumericValue(str.charAt(i+1));
            char ch = str.charAt(i);
            if(ch=='R'){
                r.add(rod);
            }
            else if(ch == 'G'){
                g.add(rod);
            }
            else if(ch == 'B'){
                b.add(rod);
            }
        }
        // System.out.println(r);
        // System.out.println(g);
        // System.out.println(b);
        int count = 0;
        for(int i=0;i<=9;i++){
            if(r.contains(i) && g.contains(i) && b.contains(i)){
                count ++;
            }
        }
        return count;
    }
}