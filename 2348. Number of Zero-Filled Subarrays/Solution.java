class Solution {
    public long zeroFilledSubarray(int[] nums) {
           long ans = 0;
           ArrayList<Integer> arr = getOccOfZero(nums);
           for(int i=0;i<arr.size();i++){
               ans+=0l+calculateEachOcc(arr.get(i));
           }
           return ans;       
    }
    public ArrayList<Integer> getOccOfZero(int []nums){
        ArrayList<Integer> arr = new ArrayList<>();
        int ctr=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0) ctr++;
          else{
              arr.add(ctr);
              ctr=0;
          }
        }
        if(ctr!=0) arr.add(ctr);
        return arr;
    }

    public long calculateEachOcc(int n){
    return (n*1l*(n+1))/2;
    }
}
