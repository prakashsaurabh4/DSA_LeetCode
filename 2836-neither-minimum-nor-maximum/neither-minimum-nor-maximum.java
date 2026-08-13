//TC=0(nlogn)
// class Solution {
//     public int findNonMinOrMax(int[] nums) {
//         int n=nums.length;
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             if(n<=2) return -1;
//         } 
//         return nums[1];
//     }
// }

//TC=0(nlogn)
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2) return -1;
        int a=nums[0];   
        int b=nums[1];   
        int c=nums[2];  
        if((a>b && a<c) || (a<b && a>c)) return a;
        else if((b>c && b<a) || (b<c && b>a)) return b;
        else return c;
    }
}
