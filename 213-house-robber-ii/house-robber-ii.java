class Solution {
    static int[] dp;
    private int loot(int i,int[] nums,int end) {
        if(i>end) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2,nums,end);
        int sick = loot(i+1,nums,end);
        return dp[i] = Math.max(pick,sick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        dp = new int[n];
        Arrays.fill(dp,-1);
        int case1 = loot(0,nums,n-2);

        dp = new int[n];
        Arrays.fill(dp,-1);
        int case2 = loot(1,nums,n-1);
        return Math.max(case1,case2);
    }
}