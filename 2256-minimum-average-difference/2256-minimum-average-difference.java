class Solution {
    public int minimumAverageDifference(int[] nums) {
        long [] sum = new long[nums.length];
        long t = 0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            sum[i]=t;
        }
        
        int min = Integer.MAX_VALUE;
        int indx = -1;
        int len = sum.length;
        
        for(int i=0;i<sum.length;i++){
            int a,b;
            if(i == len-1){
                // System.out.println("1");
                a=(int) (sum[i]/(i+1));
                b = 0;
            }
            else{
                // System.out.println("2");
                a = (int) (sum[i]/(i+1));
                b =(int) ((sum[len-1] - sum[i])/(len-i-1));
            }

            int temp = Math.abs(a-b);
            if(min>temp){
                min = temp;
                indx = i;
            }
        }
        return indx;
    }
}