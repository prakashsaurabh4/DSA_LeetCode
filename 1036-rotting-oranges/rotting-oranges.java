class Solution {
    public class Triplet{
        int row;
        int col;
        int time;
        Triplet(int row, int col, int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] mat) {
      int m = mat.length, n = mat[0].length;
       Queue<Triplet> q = new LinkedList<>();
       for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j]==2) q.add(new Triplet(i,j,0));
                }
            }
            int maxtime = 0;
            while(q.size()>0){
                Triplet front = q.remove();
                int row=front.row, col=front.col, time=front.time;
                maxtime = Math.max(maxtime,time);
                //rotting left (row,col-1)
                if(col-1>=0 && mat[row][col-1]==1){
                    mat[row][col-1]=2;
                    q.add(new Triplet(row,col-1,time+1));
                }
                //rotting right (row,col+1)
                if(col+1<n && mat[row][col+1]==1){
                    mat[row][col+1]=2;
                    q.add(new Triplet(row,col+1,time+1));
                }
                //rotting up (row-1,col)
                if(row-1>=0 && mat[row-1][col]==1){
                    mat[row-1][col]=2;
                    q.add(new Triplet(row-1,col,time+1));
                }
                //rotting down (row+1,col)
                if(row+1<m && mat[row+1][col]==1){
                    mat[row+1][col]=2;
                    q.add(new Triplet(row+1,col,time+1));
                }
            }
            for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j]==1) return -1;
                }
            }
        return maxtime;  
    }
}