class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<prefix.length;i++){
            if(isValid(prefix,i,prefix.length-1)) return i;
        }
        return -1;
    }

    public boolean isValid(int[] prefix, int idx,int n){
        if(idx==0){
            if(prefix[n]-prefix[idx]==0) return true;
        }
        else if(prefix[idx-1] == prefix[n]-prefix[idx]) return true;
        return false;
    }
}
