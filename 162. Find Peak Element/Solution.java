class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)>>1;
            if(nums[mid]<nums[mid+1]) start = mid+1;
            else end = mid-1;
        }
        return start;
    }
}
