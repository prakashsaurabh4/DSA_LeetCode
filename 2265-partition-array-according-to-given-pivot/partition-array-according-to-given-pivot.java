class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int n = nums.length;
      int[] result = new int[n];
      int countSmallerOrEqual = 0;
      int countOrequal = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) countSmallerOrEqual++;
            else if(nums[i] == pivot) countOrequal++;
        }

        int smaller = 0;                 
        int equal = countSmallerOrEqual;
        int larger = countSmallerOrEqual + countOrequal; 
        for(int i = 0;i < n;i++){
        if(nums[i] < pivot){
            result[smaller] = nums[i];
            smaller++;
        }
        else if(nums[i] == pivot){
            result[equal++] = nums[i];
        }
        else{
            result[larger++] = nums[i];
        }
      }
      return result;
    }
}