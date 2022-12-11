class Solution {
    private int solve(int i,int n,int sum,int[] nums,int[][] dp){
        if(i==n) // if only one element in the array.
            return 0;
        if(dp[i][n]!=-1)
            return dp[i][n];
        int temp=0,ans=0; // temp will store the sum of the first array and ans will store the maximum ans found.
        for(int j=i;j<=n;j++){ // putting the partion of the array starting from the starting index to the ending index
            temp+=nums[j]; // sum of the first half of the array.
            if(temp>sum-temp){ // if the sum of first half is greater so alice will take the second array sum and send that array for further calculations.
                ans=Math.max(ans,sum-temp+solve(j+1,n,sum-temp,nums,dp));
            }else if(temp<sum-temp){ // if the first half is lesser o alice will take that.
                ans=Math.max(ans,temp+solve(i,j,temp,nums,dp));
            }else{ // if the sum of both the array is same then alice will try both the arrays and take the maximum one.
                ans=Math.max(ans,sum-temp+solve(j+1,n,sum-temp,nums,dp));
                ans=Math.max(ans,temp+solve(i,j,temp,nums,dp));
            }
        }
        return dp[i][n]=ans;
    }
    public int stoneGameV(int[] stoneValue) {
        int sum=0;
        for(int ele:stoneValue)
            sum+=ele; // Calculating the sum of the whole array.
        int[][] dp=new int[stoneValue.length+1][stoneValue.length+1];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return solve(0,stoneValue.length-1,sum,stoneValue,dp); // 0 is the starting and n-1 the end of each array.
    }
}