class Solution {
    static int memo[];
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return dp(0,nums);
    }

    public int dp(int idx, int nums[]){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int take = nums[idx]+dp(idx+2,nums);
        int leave = dp(idx+1,nums);
        return memo[idx] = Math.max(take,leave);
    }
}
