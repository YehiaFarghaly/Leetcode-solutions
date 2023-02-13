class Solution {
    static int dir[] = new int[]{0,1,0,-1,0};
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) q.add(new int[]{i,j});
                else mat[i][j]=-1;
            } 
        }
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int r = tmp[0];
            int c = tmp[1];
            for(int i=0;i<4;i++){
                int nr = r+dir[i];
                int nc = c+dir[i+1];
            
            if(nr<0 || nr>=n || nc<0 || nc>=m || mat[nr][nc]!=-1) continue;
            else{
                mat[nr][nc]=mat[r][c]+1;
                q.add(new int[]{nr,nc});
            }
            }
        }
        return mat;
    }
}
