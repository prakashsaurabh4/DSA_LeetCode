class Solution { // Tc 0(n) SC(1)
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int currentPSum = 0, maxSum = Integer.MIN_VALUE;
        int currentNSum = 0, minSum = Integer.MAX_VALUE;
        for(int num : nums){
            //Pos
            currentPSum += num;
            maxSum = Math.max(maxSum,currentPSum);
            if(currentPSum < 0) {
                currentPSum = 0;
                }
            //Neg
            currentNSum += num;
            minSum = Math.min(minSum,currentNSum);
            if(currentNSum > 0){
                 currentNSum = 0;
                 }
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}