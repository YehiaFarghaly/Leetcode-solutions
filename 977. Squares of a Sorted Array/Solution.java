class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int ans[] = new int[nums.length];
        int arr[] = new int[(int)1e4+1];
        for(int i = 0; i < nums.length;i++){
            arr[Math.abs(nums[i])]++;
        }
        int j = 0;
        for(int i=0;i<arr.length;i++){
          while(arr[i]-->0) ans[j++]=i*i;
        }
        return ans;
    }
}
