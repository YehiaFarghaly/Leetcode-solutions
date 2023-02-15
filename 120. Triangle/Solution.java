class Solution {
    static int memo[][];
    public int minimumTotal(List<List<Integer>> triangle) {
        memo = new int[triangle.size()][triangle.size()];
        for(int[]x:memo) Arrays.fill(x,-1);
        return dp(0,0,triangle);
    }
    public int dp(int i, int j,List<List<Integer>> triangle){
        if(i==triangle.size()) return 0;
        if(j>=triangle.get(i).size() ) return (int)1e9;
        if(memo[i][j]!=-1) return memo[i][j];
        int down = dp(i+1,j,triangle)+triangle.get(i).get(j);
        int downRight = dp(i+1,j+1,triangle)+triangle.get(i).get(j);
        return memo[i][j] =  Math.min(down,downRight);
    }
}
