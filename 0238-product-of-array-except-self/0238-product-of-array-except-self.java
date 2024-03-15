class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int []one=new int[len];
        int []two=new int[len];
        one[0]=1;two[len-1]=1;
        for(int i=1;i<len;i++){
            one[i]=nums[i-1]*one[i-1];
        }
        for(int i=len-2;i>=0;i--){
            two[i]=nums[i+1]*two[i+1];
        }
        for(int i=0;i<len;i++){
            one[i]=one[i]*two[i];
        }
        return one;
    }
}