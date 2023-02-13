class Solution {
    static int dir[] = new int[]{0,1,0,-1,0};
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int cnt = -1;
        while(!q.isEmpty()){
            int s = q.size();
            cnt++;
            while(s-->0){
            int[] tmp = q.poll();
            int r = tmp[0];
            int c = tmp[1];
            boolean inc = true;
            for(int i=0;i<4;i++){
                int nr = r+dir[i];
                int nc = c+dir[i+1];

                if(nr<0 || nr>=n || nc<0 || nc>=m || grid[nr][nc]!=1) continue;
                else {
                    grid[nr][nc]=2;
                     if(inc){
                     inc = false;
                     }
                    q.add(new int[]{nr,nc});
                }
            }
            }
        }
        boolean valid = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) valid = false;
            }
        }
        return valid?cnt==-1?0:cnt:-1;
    }
}
