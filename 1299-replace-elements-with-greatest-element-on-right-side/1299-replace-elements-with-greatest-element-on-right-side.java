class Solution {
    public int[] replaceElements(int[] arr) {
        // Stack<Integer> temp = new Stack<>();
        // int ans[] = new int[arr.length];
        // ans[arr.length  - 1] = -1;
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for(int x = arr.length - 2; x >= 0; x--){
            int temp2 = arr[x];
            arr[x] = temp;
            temp = temp2 > temp ? temp2 : temp;
        }
        
        return arr;
    }
}