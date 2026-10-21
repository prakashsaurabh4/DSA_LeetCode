class Solution {  // TC 0(n) SC 0(n)
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0;
        int Sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            Sum += nums[i];
            int target = Sum - k;
            
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(Sum,map.getOrDefault(Sum, 0) + 1);
        }
        return count;
    }
}