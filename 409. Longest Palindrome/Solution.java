class Solution {
      int NUM_OF_CHARS=256;
    public int longestPalindrome(String s) {
          int[] chars = new int[NUM_OF_CHARS];
          for(int i=0;i<s.length();i++){
              chars[s.charAt(i)]++;
          }
          int even=0;
          boolean odd = false;
          for(int i=0;i<chars.length;i++){
               if(chars[i]%2!=0) odd = true;
               even+=chars[i]/2;
          }
          return (even*2 + ((odd)?1:0));
    }
}
