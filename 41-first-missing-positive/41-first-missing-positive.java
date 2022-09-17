class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==1 && nums[0]>1)
            return 1;
        Arrays.sort(nums);
        long min=Integer.MAX_VALUE;
        long sum=0;
        long temp;
        long n=1;
        int si=0,ei=0;
        boolean f=false;
        int indx=0;
        for(int i=0;i<nums.length-1;){
            if(nums[i]<=0){
                i++;
                indx=i;
                f=true;
                continue;
            }
            temp=nums[i];
            if(min>=temp){
                min=temp;
            }
            System.out.println(min);
            if(min!=1){
                return 1;
            }
            si=i;
            ei=i;
            // if(nums[si]==n){
            //     n++;
            // }
            // else{
            //     return (int)(n+1);
            // }
            while(nums[ei]==nums[ei+1] && ei<nums.length-2){
                ei++;
            }
            ei+=1;
            if(nums[ei]-nums[si]!=1){
                return nums[ei-1]+1;
            }
            
            i=ei;
            
            // sum+=temp;
            // n=(temp*(temp+1))/2;
            // if(sum!=n){
            //     return nums[i-1]+1;
            // }
        }
        // System.out.println(n);
        // long m=nums[nums.length-1];
        // long t=(m*(m+1))/2;
        // if(sum==0)
        //     return 1;
        // if(sum==t){
        //     return nums[nums.length-1]+1;
        // }
        if(nums[indx]!=1)
            return 1;
        if(nums[nums.length-1]<=0)
            return 1;
        if(nums[si]!=nums[ei])
            return nums[ei]+1;
        return (int)n+1;
    }
}