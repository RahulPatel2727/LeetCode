class Solution {
    public boolean isPathCrossing(String path) {
        List<Integer> l = new ArrayList<>(Arrays.asList(0,0));
        Set<List> cor = new HashSet<>();
        cor.add(l);
        int x=0, y=0;
        for(char it : path.toCharArray()){
            List<Integer> c = new ArrayList<>();
            if(it=='N') {
                c.add(x);
                c.add(y+1);
                y++;
            }
            else if(it=='S'){ 
                c.add(x);
                c.add(y-1);
                y--;
            }
            else if(it == 'E') {
                c.add(x+1);
                c.add(y);
                x++;
            }
            else {
                c.add(x-1);
                c.add(y);
                x--;
            }
            // System.out.println(l +" "+ c);
            if(cor.contains(c)){
                return true;
            }
            cor.add(c);
        }
        return false;
    }
}