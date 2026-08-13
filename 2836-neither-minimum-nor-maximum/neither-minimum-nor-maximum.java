class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(n<=2) return -1;
        } 
        return nums[1];
    }
}