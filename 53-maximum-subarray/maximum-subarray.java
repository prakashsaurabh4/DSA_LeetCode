class Solution { // TC 0(n) SC 0(1)
    public int maxSubArray(int[] nums) {
        int n = nums.length, leftSum = 0, rightSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(leftSum < 0) leftSum=0;
            if(rightSum < 0) rightSum=0;
            leftSum += nums[i];
            rightSum += nums[n-1-i];
                maxSum = Math.max(maxSum, Math.max(leftSum,rightSum));
            }
        return maxSum;
    }
}