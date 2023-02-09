class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256];
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
      
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]]==1) return i;
        }
        return -1;
    }
}
