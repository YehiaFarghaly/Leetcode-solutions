class Solution {
    public void rotate(int[] nums, int k) {
        int ans[] = new int[nums.length];
        k = k%nums.length;
        int idx=0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[idx++]=nums[i];
        }
        for(int i=0;idx<nums.length;i++){
            ans[idx++]=nums[i];
        }
      for(int i=0;i<nums.length;i++){
          nums[i]=ans[i];
      }
    }
}
