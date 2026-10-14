class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentCount = 0;
        int maxCount = 0;
        
        int j = 0;
        while(j<n){
            if(nums[j]==1){
                currentCount++;
            }
            else{
                maxCount = Math.max(maxCount,currentCount);
                currentCount = 0;
            }
            j++;
        }
        maxCount = Math.max(maxCount,currentCount);
        return maxCount;
    }
}