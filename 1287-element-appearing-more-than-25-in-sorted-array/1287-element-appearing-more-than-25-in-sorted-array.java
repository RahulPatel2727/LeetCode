class Solution {
    public int findSpecialInteger(int[] arr) {
        int p = arr.length/4+1;
        System.out.println(p);
        int cur = 0;
        int c = 0;
        for(int it : arr){
            if(cur == it){
                c++;
                
            }else{
                if(c>=p) return cur;
                cur = it;
                c=1;
            }
        }
        return cur;
    }
}