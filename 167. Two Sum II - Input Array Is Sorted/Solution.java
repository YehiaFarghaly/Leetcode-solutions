class Solution {
    public int binarySearch(int[]nums, int current, int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
        int mid = (start+end)>>1;
            if(nums[current]+nums[mid]>target) end=mid-1;
            else if(nums[current]+nums[mid]<target) start=mid+1;
            else return mid+1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int n = binarySearch(numbers,i,target);
            if(n!=-1 && n!=i+1) return new int[]{Math.min(i+1,n),Math.max(i+1,n)};
        }
        return new int[]{};
    }
}
