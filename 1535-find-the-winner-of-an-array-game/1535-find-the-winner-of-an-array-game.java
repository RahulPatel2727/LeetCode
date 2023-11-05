class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int max = arr[0];
        Queue<Integer> q = new LinkedList<>();
        for(int it = 1; it<n;it++){
            max = Math.max(arr[it], max);
            q.add(arr[it]);
        }
        
        int first = arr[0];
        int count = 0;
        
        while(!q.isEmpty()){
            int sec = q.poll();
            if(first>sec){
                q.add(sec);
                count++;
            }
            else{
                q.add(first);
                first = sec;
                count = 1;
            }
            if(count == k || first == max){
                return first;
            }
        }
        return -1;
    }
}