class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       int leftSum = 0, rightSum = 0, ans = nums[0];
       for(int i=0;i<n;i++){
        if(leftSum < 0) leftSum=0;
        if(rightSum < 0) rightSum=0;
        leftSum += nums[i];
        rightSum += nums[n-1-i];
        ans = Math.max(ans, Math.max(leftSum, rightSum));
       }  
       return ans;
    }
}