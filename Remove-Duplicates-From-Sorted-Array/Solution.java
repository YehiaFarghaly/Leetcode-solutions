class Solution {
    public int removeDuplicates(int[] nums) {
        int[] occures = new int[201];
        HashSet<Integer> hs = new HashSet<>();
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            if(occures[nums[i]+100]==0) {
                nums[ctr]=nums[i];
                ctr++;
                occures[nums[i]+100]++;
            }
        }
        return hs.size();
    }
}
