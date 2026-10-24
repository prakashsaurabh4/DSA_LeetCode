class Solution { // TC 0(n) SC 0(1)
    public int maxSubArray(int[] nums) {
        int n = nums.length, currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) currentSum=0;
            }
        return maxSum;
    }
}