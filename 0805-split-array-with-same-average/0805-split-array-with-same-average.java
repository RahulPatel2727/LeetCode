class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        if(nums.length<=1)
            return false;
        int n = nums.length;
        //finding sum of elements of the array :- nums
        int sum = 0;
        for(int i=0 ; i<n ; i++)
        {
            sum += nums[i];
        }
        // We divide the given array into 2 parts , where n1 = length of part-1 & s1 = sum of elements of part-1
        // s1 = (sum*n1)/n , since the average of both part-1 & part-2 are equal
        // Range of n1 = [ 1 , n-1 ]
        // We iterate over each possible valid value of n1 , and check if the corresponding subseq of sum = s1 & length = n1 is possible or not
        for(int n1=1 ; n1<=(n-1) ; n1++)
        {
            int numerator = (sum*n1);
            int denominator = n;
            int s1 = numerator/denominator;
            // if the s1 = float value , then we move on to the next possible n1
            if(numerator%denominator !=0) 
                continue;
            //if s1 = integer , then we check if there exists a subseq whose sum = s1 , we check this by dp
            Boolean dp[][] = new Boolean[n+1][s1+1];
            boolean isTargetPresent = isPresent( s1 ,0,0,n1, nums, nums.length , dp);
            if(isTargetPresent)
                return true;
        }
        return false;
    }
	
	
	// function that check if there exists a subseq. of length=n1 & sum=s1
   private boolean isPresent(int target,int count,int sum,int n1, int[] nums, int n , Boolean dp[][])
   {
       if(n==0)
        {
            if(target==0 && count==n1)
                return true;
            else
                return false;
        }
        if(count==n1)
        {
            if(target==0)
                return true;
            else
                return false;
        }
        if(dp[n][target] != null)
            return dp[n][target];
        if(nums[n-1] > target)
        {
            boolean skip = isPresent(target,count,sum,n1,nums,n-1,dp);
            dp[n][target] = skip;
            return dp[n][target];
        }
        else
        {
            boolean include = isPresent(target-nums[n-1] , count+1 , sum + nums[n-1] , n1 , nums , n-1 , dp);
            boolean exclude = isPresent(target , count , sum , n1 , nums , n-1 , dp );
            dp[n][target] = include || exclude;
            return dp[n][target];
        }

   }
}