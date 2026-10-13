class Solution {
    public int maxArea(int[] height) {
     int n = height.length;
     int maxArea = 0;   
     int l = 0, r = n-1;
     while(l<=r){
        int h = Math.min(height[l],height[r]);
        int w = r - l;
        int area = h * w;
        maxArea = Math.max(maxArea,area);
        if(height[l]<=height[r]) l++;
        else r--;
     }
     return maxArea;
    }
}