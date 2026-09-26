class Solution {
    static int[][] dp;

    static int helper(int i, int sum, int target, int[] arr) {
        if(i == arr.length) {
            if(sum == target) return 1;
            else return 0;
        }

        if(dp[i][sum + 1000] != -1) {
            return dp[i][sum + 1000];
        }

        int add = helper(i + 1, sum + arr[i], target, arr);
        int sub = helper(i + 1, sum - arr[i], target, arr);

        return dp[i][sum + 1000] = add + sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
         int n = nums.length;

        dp = new int[n][2001];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, target, nums);    
    }
}