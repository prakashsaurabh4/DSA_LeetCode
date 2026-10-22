class Solution {  // TC 0(n)  SC 0(k)
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(0,-1);
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(map.containsKey(rem)){
                if(i - map.get(rem) >= 2){
                    return true;
                }
                }else{
                    map.put(rem,i);
                }
            }
        return false;
    }
}