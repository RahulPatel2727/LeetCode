class Solution {
    public List<Integer> lexicalOrder(int n) {
        List <Integer> list = new ArrayList<>();
        printLexico(0,n,list);
        // list.remove(0);
        return list;
    }
    public static void printLexico(int cur, int n, List<Integer> list){
        if(cur > n){
            return;
        }
        // System.out.println(cur);
        if(cur!=0){
            list.add(cur);
        }
        int i =0;
        if(cur == 0){
            i = 1;
        }
        for ( ; i <= 9; i++) {
            printLexico(cur*10+i,n, list);
        }
    }
}