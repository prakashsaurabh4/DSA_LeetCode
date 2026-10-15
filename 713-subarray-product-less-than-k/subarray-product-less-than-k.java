class Solution { // TC 0(n) SC (1)
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int count = 0, n = nums.length;
        int left = 0, product = 1;
        for(int right=0;right<n;right++){
            product *= nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}