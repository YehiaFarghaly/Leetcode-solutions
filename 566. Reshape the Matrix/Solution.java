class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ret[][] = new int[r][c];
        int ctr1=0;
        int ctr2=0;
        int size=0;
        for(int i=0;i<mat.length;i++) size+=mat[i].length;
      if(r*c == size){
         for(int i=0;i<mat.length;i++){
             for(int j=0;j<mat[i].length;j++){
               ret[ctr1][ctr2++] = mat[i][j];
               if(ctr2 >= c) {ctr1++;
               ctr2=0;
               }
               if(ctr1>=r) return ret;
             }
         }
         return ret;
      }
      else return mat;
    }
}
