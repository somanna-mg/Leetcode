class Solution {
    public int minimumMountainRemovals(int[] nums) {
     
        int[] dp = new int[nums.length];
        
        dp[0] = 1;
        
        
        
        for(int i=1; i<nums.length; i++)
        {
            dp[i] = 1;
            
            for(int j=0; j<i; j++)
            {
                if(nums[i] > nums[j] && dp[i] <= dp[j])
                {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        
        
        
        
        
        
        
        int[] dp2 = new int[nums.length];
        
        dp2[dp2.length-1] = 1;
        
        for(int i=nums.length-2; i>=0; i--)
        {
            dp2[i] = 1;
            
            for(int j=nums.length-1; j>i; j--)
            {
                
                // System.out.println(i+" "+j+" => "+nums[i]+" "+nums[j]);
                
                if(nums[i] > nums[j] && dp2[i] <= dp2[j])
                {
                    dp2[i] = dp2[j] + 1;
                    // System.out.println(dp2[i]);
                }
            }
        }
        
        
        int max = 1;
        for(int i=0; i<dp.length; i++)
        {
            
            // System.out.println(dp[i] +" "+dp2[i]);
            
            if( (dp[i] > 1 && dp2[i] > 1)  &&    (dp[i] + dp2[i] - 1) > max)
            {
                max = dp[i] + dp2[i] - 1;
            }
        }
        
        return dp.length - max;
        
        
        
        
        
    }
}