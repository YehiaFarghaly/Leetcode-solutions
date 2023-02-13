class Solution {
      static int memo[];
      
    public int fib(int n) {
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dp(n);
    }
    public int dp(int n){
        if(n==0)return 0;
        if(n==1) return 1;
        if(memo[n]!=-1) return memo[n];
         return memo[n] = dp(n-2)+dp(n-1);
    }

}
