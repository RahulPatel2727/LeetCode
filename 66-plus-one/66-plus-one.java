class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        List <Integer> list=new ArrayList<>();
        int add=1;
        for(int i=len-1;i>=0;i--){
            int d=digits[i]+add;
            add=d/10;
            list.add(d%10);
        }
        if(add==1)
            list.add(1);
        int size=list.size();
        int [] res=new int[size];
        for(Integer it:list){
            res[size-1]=it;
            size--;
        }
        return res;
    }
}