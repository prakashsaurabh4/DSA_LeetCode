class Solution { // TC 0(n) SC (1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentCount = 0;
        int maxCount = 0;
        
         for(int j=0;j<n;j++){
            if(nums[j]==1){
                currentCount++;
            }
            else{
                maxCount = Math.max(maxCount,currentCount);
                currentCount = 0;
            }
        }
        return  Math.max(maxCount,currentCount);
    }   
}