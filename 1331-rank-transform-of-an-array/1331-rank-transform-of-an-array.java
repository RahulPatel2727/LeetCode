class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] temp = arr.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],map.size()+1);
        }
        for(int i = 0; i<arr.length;i++){
            temp[i]=map.get(temp[i]);
        }
        return temp;
    }
}