class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int n = nums.length;
        int totalSum = 0;

        int maxSum = nums[0], currMax = 0;
        int minSum = nums[0], currMin = 0;

        for (int i = 0; i < n; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);

            totalSum += nums[i];
        }

        if (maxSum < 0) {
            return maxSum;
        }


        return Math.max(maxSum, totalSum - minSum);
    }
}