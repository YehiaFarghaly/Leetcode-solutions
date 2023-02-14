class Solution {
    static int[][] memo;
    public int uniquePaths(int m, int n) {
         memo = new int[m+1][n+1];
         for(int[]x:memo) Arrays.fill(x,-1);
         return dp(m,n);
    }

    public int dp(int m, int n){
        if(n<0 || m<0) return 0;
        if(m==1 && n==1) return 1;
        if(memo[m][n]!=-1) return memo[m][n];
        return memo[m][n] = dp(m-1,n)+dp(m,n-1);
    }
}
