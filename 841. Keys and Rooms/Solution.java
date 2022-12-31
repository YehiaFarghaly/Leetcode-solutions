class Solution {
    static boolean[] vis;
  public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
      vis = new boolean[rooms.size()];
  dfs(0,rooms);
              
              boolean valid = true;
              for(int i=0;i<vis.length;i++){
                  if(!vis[i]) {
                  valid = false;
                  break;
                  }
              }
             return valid; 
  }

  public static void dfs(int node, List<List<Integer>> adjList){
                   vis[node]=true;
                       for(int i : adjList.get(node)){
                 
                           if(!vis[i]) dfs(i,adjList);
                       }
  }
}
