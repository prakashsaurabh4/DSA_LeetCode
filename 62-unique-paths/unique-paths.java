class Solution {
    private int paths(int r, int c, int er, int ec,int[][] dp) {
     if(r==er && c==ec) return 1;
     if(r>er || c>ec) return 0; 
     if(dp[r][c] != -1) return dp[r][c];  
     int rightWays = paths(r,c+1,er,ec,dp);   
     int downWays = paths(r+1,c,er,ec,dp); 
     return dp[r][c] = rightWays + downWays;  
    }
    public int uniquePaths(int m, int n) {
     int[][] dp = new int[m][n];
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j] = -1;
        }
     }   
     return paths(0,0,m-1,n-1,dp);   
    }
}