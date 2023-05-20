class Solution {
    public int[] twoSum(int[] arr, int target) {
        int one = 0, two = 0;
        for(int i=0;i<arr.length;i++){
            one = i;
            
            int st = i+1;
            int en = arr.length-1;
            
            while(st<=en){
                int mid = st + (en - st)/2;
                if(arr[mid] == target-arr[one]){
                    two = mid;
                    break;
                }
                else if(arr[mid] < target-arr[one]){
                    st = mid + 1;
                }
                else {
                    en = mid - 1;
                }
            }
            if(arr[one] + arr[two] == target){
                return new int[]{one+1,two+1};
            }
        }
        return arr;
    }
}