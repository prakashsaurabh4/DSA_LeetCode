class Solution { // TC 0(n) SC 0(1)
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp =s[i];
            s[i] = s[j];
            s[j] = temp; 
            i++;
            j--;
        }
    }
}