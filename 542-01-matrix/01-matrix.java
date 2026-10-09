class Solution {
    public class Pair{
        int row;
        int col;
        Pair(int row, int col){
        this.row=row;
        this.col=col;
                }
            }
    public int[][] updateMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans  = new int[m][n];
        
                Queue<Pair> q = new LinkedList<>();
                for(int i=0;i<m;i++) {
                    for(int j=0;j<n;j++) {
                    if(grid[i][j]==0) q.add(new Pair(i,j));
                    else ans[i][j] = -1;
                    
               }
            }
                while (q.size() > 0) {
            Pair front = q.remove();
            int row = front.row, col = front.col;

            // left (row, col-1)
            if (col - 1 >= 0 && ans[row][col - 1] == -1) {
                ans[row][col - 1] = ans[row][col] + 1;
                q.add(new Pair(row, col - 1));
            }
            // right (row, col+1)
            if (col + 1 < n && ans[row][col + 1] == -1) {
                ans[row][col + 1] = ans[row][col] + 1;
                q.add(new Pair(row, col + 1));
            }
            // up (row-1, col)
            if (row - 1 >= 0 && ans[row - 1][col] == -1) {
                ans[row - 1][col] = ans[row][col] + 1;
                q.add(new Pair(row - 1, col));
            }
            // down (row+1, col)
            if (row + 1 < m && ans[row + 1][col] == -1) {
                ans[row + 1][col] = ans[row][col] + 1;
                q.add(new Pair(row + 1, col));
            }
        }
             
            return ans;
    }
}