class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] cnt1 = new int[26];
        for(int i=0;i<s1.length();i++) cnt1[s1.charAt(i)-'a']++;
       for(int i=0;i<=s2.length()-s1.length();i++){
               boolean valid = true;
        int[] cnt2 = new int[26];
               String tmp = s2.substring(i,i+s1.length());
               for(int j=0;j<tmp.length();j++){
                   cnt2[tmp.charAt(j)-'a']++;           
               }
               for(int j=0;j<26;j++){
                   if(cnt1[j]!=cnt2[j]) valid = false;
               }
                   if(valid) return true;      
       } 
       return false;
    }
}
