class Solution {
    public int gcdOfOddEvenSums(int n) {
    int oddsum = n * (2*1 + (n-1)*2)/2;
    int evensum = n * (2*2 + (n-1)*2)/2;
    return gcd(oddsum, evensum);
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}