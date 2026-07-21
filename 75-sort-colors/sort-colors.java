class Solution {
    public void sortColors(int[] nums) {
      int numberofzeroes = 0;
      int numberofones = 0;
      int numberoftwos = 0;
      for(int x : nums){
        if(x==0) numberofzeroes++;
        else if(x==1) numberofones++;
        else numberoftwos++;
      }  
      for(int i=0;i<numberofzeroes;i++){
        nums[i]=0;
      }
      for(int i=numberofzeroes;i<numberofzeroes+numberofones;i++){
        nums[i]=1;
      }
      for(int i=numberofzeroes+numberofones;i<nums.length;i++){
        nums[i]=2;
      }
    }
}