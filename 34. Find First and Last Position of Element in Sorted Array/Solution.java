class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[]{searchFirst(nums,target),searchLast(nums,target)};
        return ret;
    }
    public int searchFirst(int[] nums,int target){
     int start=0;
     int end = nums.length-1;
     while(start<=end){
         int mid = (start+end)>>1;
         if(nums[mid]==target && (mid==0 || nums[mid-1]!=target)){
              return mid;
         }
         else if(nums[mid]<target){
             start = mid+1;
         }
         else end = mid-1;
     }
     return -1; 
    }
    public int searchLast(int[] nums,int target){
           int start=0;
     int end = nums.length-1;
     while(start<=end){
         int mid = (start+end)>>1;
         if(nums[mid]==target && (mid==nums.length-1 || nums[mid+1]!=target)){
            return mid;
         }
         else if(nums[mid]>target){
             end = mid-1;
         }
         else start = mid+1;
     }
     return -1; 
    }
}
