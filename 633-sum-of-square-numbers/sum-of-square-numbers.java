// class Solution {
//     public boolean judgeSquareSum(int c) {
//       for(int i = 0;i*i <= c;i++){
//         int b2 = c - i * i;
//         int b = (int)Math.sqrt(b2);
//         if(b * b == b2){
//             return true;
//         }
//       }     
//       return false;
//     }
// }

class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        long right = (long)Math.sqrt(c);
        while(left <= right){
            long sum = left * left + right * right;
            if(sum == c) return true;
            else if(sum > c) right--;
            else left++;
        }
        return false;
    }
}