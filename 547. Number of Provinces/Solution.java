class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[]vis = new boolean[isConnected.length];
        int ctr=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){ 
                dfs(i,isConnected,vis);
                ctr++;
            }
        }
        return ctr;
    }
    public void dfs(int node,int[][]mat, boolean[] vis){
       vis[node] = true;
       for(int i=0;i<mat[node].length;i++){
           if(mat[node][i]==1 &&!vis[i]) dfs(i,mat,vis);
       }
    }
}
