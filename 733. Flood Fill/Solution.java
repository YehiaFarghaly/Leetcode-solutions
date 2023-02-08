class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor==color) return image;
       fldFill(image,sr,sc,color,oldColor);
       return image;
    }
    public void fldFill(int[][]image,int sr, int sc, int color, int oldColor){
        if(sr<0||sc<0||sr==image.length||sc==image[sr].length||oldColor!=image[sr][sc]) return;
         image[sr][sc]=color;
        fldFill(image,sr+1,sc,color,oldColor);
        fldFill(image,sr-1,sc,color,oldColor);
        fldFill(image,sr,sc+1,color,oldColor);
        fldFill(image,sr,sc-1,color,oldColor);
    }
}
