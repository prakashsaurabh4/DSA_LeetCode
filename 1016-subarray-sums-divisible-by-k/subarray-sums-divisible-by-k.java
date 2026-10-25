class Solution { // TC 0(n)  SC 0(k)
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, prefixSum = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0) rem += k;
             if(map.containsKey(rem)){
                count += map.get(rem);
             }
             map.put(rem,map.getOrDefault(rem,0) + 1);
        }
        return count;
    }
}