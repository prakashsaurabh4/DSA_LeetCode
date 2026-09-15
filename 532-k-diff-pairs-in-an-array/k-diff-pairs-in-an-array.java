class Solution {
    public int findPairs(int[] nums, int k) {
               HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)) map.put(ele,1);
            else map.put(ele,map.get(ele)+1);
        }
        int pairs = 0;
       for(int ele : map.keySet()){ 
            
            if(k == 0) {
                if(map.get(ele) > 1)
                    pairs++;
            }
            else {
                int rem = ele - k;
                
                if(map.containsKey(rem))
                    pairs++;
            }
        } 
        return pairs;
    }
}
