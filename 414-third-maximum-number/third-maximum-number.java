class Solution {
    public int thirdMax(int[] nums) {
      int n = nums.length;
      long firstMax=Long.MIN_VALUE,secondMax=Long.MIN_VALUE,thirdMax=Long.MIN_VALUE;
     
      for(int i=0;i<n;i++){
         if (nums[i] == firstMax || nums[i] == secondMax || nums[i] == thirdMax) continue;
            if(nums[i]>firstMax){
               thirdMax=secondMax;
               secondMax=firstMax;
               firstMax=nums[i]; 
            }
            else if(nums[i]>secondMax){
               thirdMax=secondMax;
               secondMax=nums[i]; 
            }
            else if(nums[i]>thirdMax){
                thirdMax=nums[i];
            }
      }
      return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
    }
}