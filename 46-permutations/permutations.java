class Solution {
    private void permutations(int[] nums, boolean[] check, List<Integer> a, List<List<Integer>> ans){
        int n = nums.length;
        if(a.size()==n){
            List<Integer> copy = new ArrayList<>(a); //deep Copy
            ans.add(copy);
            return;
        }
        for(int i=0;i<n;i++){
            if(!check[i]){
                a.add(nums[i]);
                check[i] = true;
                permutations(nums,check,a,ans);
                a.remove(a.size()-1);
                check[i] = false;

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        permutations(nums,check,a,ans);
        return ans;
    }
}


//Yet to learn
// class Solution {

//     private void permutations(int[] nums, int idx, List<List<Integer>> ans) {

//         int n = nums.length;

//         if (idx == n) {
//             List<Integer> copy = new ArrayList<>();

//             for (int ele : nums) {
//                 copy.add(ele);
//             }

//             ans.add(copy);
//             return;
//         }

//         for (int i = idx; i < n; i++) {

//             // Swap
//             int temp = nums[idx];
//             nums[idx] = nums[i];
//             nums[i] = temp;

//             permutations(nums, idx + 1, ans);

//             // Backtracking / undo swap
//             temp = nums[idx];
//             nums[idx] = nums[i];
//             nums[i] = temp;
//         }
//     }

//     public List<List<Integer>> permute(int[] nums) {

//         List<List<Integer>> ans = new ArrayList<>();

//         permutations(nums, 0, ans);

//         return ans;
//     }
// }