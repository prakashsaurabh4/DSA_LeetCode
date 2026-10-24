class Solution { //TC 0(n) SC(1)
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        int leftProd = 1, rightProd = 1;
        for(int i=0;i<n;i++){
            if(leftProd == 0) leftProd = 1;
            if(rightProd == 0) rightProd = 1;

            leftProd *= nums[i];
            rightProd *= nums[n-1-i];

            maxProd = Math.max(maxProd,Math.max(rightProd,leftProd));

            
        }
        return maxProd;
    }
}