class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]=='1'&&!visited[i][j]) {
                    count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    visited[i][j]=true;

                    while(q.size()>0) {
                        int[] front=q.remove();
                        int row=front[0];
                        int col=front[1];

                        if(row-1>=0 && grid[row-1][col]=='1' && !visited[row-1][col]) {
                            q.add(new int[]{row-1,col});
                            visited[row-1][col]=true;
                        }

                        if(row+1<m && grid[row+1][col]=='1' && !visited[row+1][col]) {
                            q.add(new int[]{row+1,col});
                            visited[row+1][col]=true;
                        }

                        if(col-1>=0 && grid[row][col-1]=='1' && !visited[row][col-1]) {
                            q.add(new int[]{row,col-1});
                            visited[row][col-1]=true;
                        }

                        if(col+1<n && grid[row][col+1]=='1' && !visited[row][col+1]) {
                            q.add(new int[]{row,col+1});
                            visited[row][col+1]=true;
                        }
                    }
                }
            }
        }
        return count;
    }
}