class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int ans = 0;
        int flag=0;
        int[] dp = new int[n+1];
        if (n == 1) {
            if (s.charAt(0) != '0')
                return 1;
            else
                return 0;
        }

        if (s.charAt(0) == '0')
            return 0;
        dp[0]=1;
        dp[1]=1;
        for (int i = 0; i < n; i++) {
            if(i==0)
            {
                if (s.charAt(i + 1) == '0')
                        {
                            String ss = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                        int result = Integer.parseInt(ss);
                        if (result >= 1 && result <= 26)
                            {
                              dp[i+1]=dp[i+1-1];
                            dp[i+1+1]=dp[i+1];

                            i++;
                            continue;
                            }
                          
                        return 0;    
                        }
                        else
                        {
                            dp[i+1]=dp[i+1-1];
                        }
            }
            else if (i == n - 1) {
                if (s.charAt(i) != '0') {
                    dp[i+1]=dp[i+1-1];
                    if(s.charAt(i-1)!='0')
                    {
                    String ss = Character.toString(s.charAt(i - 1)) + Character.toString(s.charAt(i));
                    int result = Integer.parseInt(ss);
                    
                    if (result >= 1 && result <= 26)
                        {
                             dp[i+1]+=dp[i+1-2];
                        }
                    }    
                } else {
                    return 0;
                }
            } else {
                if (s.charAt(i) != '0') {
                    if (s.charAt(i + 1) == '0')
                        {
                            String ss = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                        int result = Integer.parseInt(ss);
                        if (result >= 1 && result <= 26)
                            {
                              dp[i+1]=dp[i+1-1];
                            dp[i+1+1]=dp[i+1];
                            i++;
                            continue;
                            }
                          
                        return 0;    
                        }
                    else {
                        dp[i+1]=dp[i+1-1];
                        if(s.charAt(i-1)!='0')
                        {
                        String ss = Character.toString(s.charAt(i - 1)) + Character.toString(s.charAt(i));
                        int result = Integer.parseInt(ss);
                        if (result >= 1 && result <= 26)
                            {
                              dp[i+1]+=dp[i+1-2];
                            }
                        }   
                        }
                } else {
                    return 0;
                }
            }
        }
        
        return dp[n];
    }
}