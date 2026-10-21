class Solution {  // TC 0(n^2)  SC 0(1)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int rightProduct = 1;

        for(int r=n-1;r>=0;r--){
            ans[r] = ans[r] * rightProduct;
            rightProduct *= nums[r];
        }
        return ans;
    }
}