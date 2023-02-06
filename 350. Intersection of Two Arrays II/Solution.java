class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      int[]ctr1 = new int[1001];
      int[]ctr2 = new int[1001];
      for(int i=0;i<nums1.length;i++) ctr1[nums1[i]]++;
      for(int i=0;i<nums2.length;i++) ctr2[nums2[i]]++;
      int length=0;
      for(int i=0;i<ctr1.length;i++){
          int req = Math.min(ctr1[i],ctr2[i]);
          ctr1[i]= req;
          length+=req;
      }
      int []ret = new int[length];
      int idx=0;
      for(int i=0;i<ctr1.length;i++){
          while(ctr1[i]-->0){
              ret[idx++]=i;
          }
      }
      return ret; 
    }
}
