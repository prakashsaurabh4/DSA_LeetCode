class Solution {
    public String reverseStr(String s, int k) {
     char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1); 
            reverse(arr, i, j);
        }
        
        return new String(arr);
     }   
     static void reverse(char[] s,int i,int j){
        while(i<j){
            char temp=s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
    }
    }
}