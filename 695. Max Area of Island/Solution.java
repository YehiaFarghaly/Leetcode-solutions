class Solution {
    class Pair{
        int x,y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

     public int bfs(int[][]grid,int i, int j, int cnt,int[][]vis){
           Queue<Pair> q = new LinkedList<>();
           vis[i][j]=1;
           q.add(new Pair(i,j));
           int[] delRow = {-1,1,0,0};
           int[] delCol = {0,0,-1,1};
           while(!q.isEmpty()){
                  int r = q.peek().x;
                  int c = q.peek().y;
                  q.poll();
                  for(int k=0;k<4;k++){
                      int row = r+delRow[k];
                      int cln = c+delCol[k];
                      if(row>-1 && cln>-1 && row<grid.length && cln<grid[0].length &&
                       vis[row][cln]==0 && grid[row][cln]==1){
                               cnt++;
                               q.add(new Pair(row,cln));
                               vis[row][cln]=1;
                      }
                  }
           }
           return cnt;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        int ans = 0;
        int vis[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(vis[i][j]==0 && grid[i][j]==1)
                count = bfs(grid,i,j,1,vis);
                  ans = Math.max(ans,count);
            }
        }
        return ans;
    }
   
}
