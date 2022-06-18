class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        for(int i=1;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    list.get(i).add(1);
                }
                else{
                    list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
        }
        return list;
    }
}