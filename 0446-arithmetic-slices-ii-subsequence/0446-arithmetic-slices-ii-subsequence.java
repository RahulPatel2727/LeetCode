class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A==null||A.length<3) return 0;
        List<Map<Integer,Integer>> list=new ArrayList<Map<Integer,Integer>>();
        int res=0;
        for(int i=1;i<A.length;i++){
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int j=0;j<i;j++){
                if((long)A[i]-(long)A[j]>Integer.MAX_VALUE) continue;
                if((long)A[i]-(long)A[j]<Integer.MIN_VALUE) continue;
                int dif=A[i]-A[j];
                if(j==0){
                    map.put(dif,1);
                    continue;
                }
                Map<Integer,Integer> temp=list.get(j-1);
                int sum=0;
                if(temp.containsKey(dif)){
                    sum=temp.get(dif);
                }
                if(map.containsKey(dif)){
                    map.put(dif,map.get(dif)+sum+1);
                }else{
                    map.put(dif,sum+1);
                }
                res+=sum;
            }
            list.add(map);
        }
        return res;
    }
}