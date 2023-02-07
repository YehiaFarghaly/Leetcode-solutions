class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][]ret = new int[numRows][];
        for(int i=0;i<numRows;i++){
            ret[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) ret[i][j]=1;
                else {
                    ret[i][j]=ret[i-1][j-1]+ret[i-1][j];
                }
            }
        }
        return ArrToList(ret);
    }
    public List<List<Integer>> ArrToList(int[][] arr){
      List<List<Integer>> ret = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          ArrayList<Integer> list = new ArrayList<>();
          for(int j=0;j<arr[i].length;j++){
              list.add(arr[i][j]);
          }
          ret.add(list);
      }
      return ret;
    }
}
