class Solution {
    static int[] dp;
    private int loot(int i,int[] nums) {
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2,nums);
        int sick = loot(i+1,nums);
        return dp[i] = Math.max(pick,sick);
        
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }
}