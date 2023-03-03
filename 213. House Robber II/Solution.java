class Solution {
      public static int rob(int[] nums) {
          if(nums.length==1) return nums[0];
	        return Math.max(dp(nums,nums.length-1,0, new Integer[nums.length]),dp(nums,nums.length,1, new Integer[nums.length]));
	    }
	    public static int dp(int nums[],int n, int idx, Integer[]memo){
	        if(idx>=n) return 0;
	        if(memo[idx]!=null) return memo[idx];
	        int take = dp(nums,n,idx+2,memo)+nums[idx];
	        int leave = dp(nums,n,idx+1,memo);
	        return memo[idx] = Math.max(take,leave);
	    }
}
