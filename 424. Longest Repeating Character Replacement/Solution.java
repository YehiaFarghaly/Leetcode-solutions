class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, max = 0, largestCount = 0;
        int[]ctr = new int[26];
        for(int end = 0;end<s.length();end++){
           ctr[s.charAt(end)-'A']++;
           largestCount = Math.max(largestCount,ctr[s.charAt(end)-'A']);
           if(end-start+1-largestCount>k){
               ctr[s.charAt(start)-'A']--;
               start++;
           }
           max = Math.max(max,end-start+1);
        }
        return max;
    }
}
