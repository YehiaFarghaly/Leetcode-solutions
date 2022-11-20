class Solution {
    static int memo[];
    
    public static int dp(int i, int n){
        if(i>n) return 0;
        if(i==n) return 1;
        if(memo[i]!=-1) return memo[i];
        return memo[i] = dp(i+1,n)+dp(i+2,n);
    }
    
    public int climbStairs(int n) {
        memo = new int[n+1];
        for(int i=0;i<memo.length;i++) memo[i]=-1;
        return dp(0,n);
    }
}