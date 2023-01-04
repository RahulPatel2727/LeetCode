class Solution {
    public int minimumRounds(int[] tasks) {
        return min(tasks);
    }
    public static int min(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int c = 0;
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            int frq = mp.getValue();
            if(frq<2){
                return -1;
            }
            int mod = frq % 3;
            if(mod == 0){
                c += frq/3;
            }
            else{
                c += frq/3 + 1;
            }
        }
        return c;
    }
}