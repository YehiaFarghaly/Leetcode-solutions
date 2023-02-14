class Solution {
    static int memo[];
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(dp(0,cost),dp(1,cost));
    }
    public int dp(int idx, int cost[]){
        if(idx>=cost.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int moveOnce = dp(idx+1,cost)+cost[idx];
        int moveTwice = dp(idx+2,cost)+cost[idx];
        return memo[idx] = Math.min(moveOnce,moveTwice);
    }
}
