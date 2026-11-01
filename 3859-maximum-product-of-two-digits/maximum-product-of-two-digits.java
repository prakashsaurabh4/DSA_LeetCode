class Solution { //TC 0(n) SC 0(1)
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        while(n!=0){
           int a = n%10;
           if(a>max1){
            max2=max1;
            max1=a;
           }
            else if(a>max2) max2 = a;

            n/=10;
        }
        return max1*max2;
    }
}