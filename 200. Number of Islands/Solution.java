class Solution {
    static int dir[] = new int[]{0,1,0,-1,0};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
       int ctr=0;
        int[][]vis = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                 BFS(grid,new int[]{i,j},vis,n,m);
                 ctr++;
                }
            }
        }
      return ctr;
      
    }

       public  void BFS(char[][] grid,int[] arr,int[][]vis ,int n, int m){
       Queue<int[]> q = new LinkedList<>();
       q.add(arr);
            vis[q.peek()[0]][q.peek()[1]]=1;
      while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            for(int i=0;i<4;i++){
                int nr = r+dir[i];
                int nc = c+dir[i+1];
                if(nr<0 || nr>=n || nc<0 || nc>=m || vis[nr][nc]==1|| grid[nr][nc]=='0') continue;
                else {
                    vis[nr][nc]=1;
                    q.add(new int[]{nr,nc});
                }
            }
        }

    }
}
