class Solution { // O(mn(2k+1)^2) 0(mn)
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum = 0;

                for(int r=i-k;r<=i+k;r++){
                    for(int c=j-k;c<=j+k;c++){

                        if(r>=0 && r<m && c>=0 && c<n){
                            sum += mat[r][c];
                        }
                    }
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}