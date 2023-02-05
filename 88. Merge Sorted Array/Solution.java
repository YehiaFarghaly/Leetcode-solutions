class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<m;i++){
            tm.put(nums1[i],tm.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<n;i++){
            tm.put(nums2[i],tm.getOrDefault(nums2[i],0)+1);
        }
        int idx=0;
        for(int key:tm.keySet()){
            int ctr = tm.get(key);
            while(ctr-- > 0){
               nums1[idx++]=key;
            }
        }
    }
}
