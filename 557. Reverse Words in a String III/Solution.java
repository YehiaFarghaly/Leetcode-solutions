class Solution {

      public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char tmp = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=tmp;
        }
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for(String s3: arr){
            char[] s2 = s3.toCharArray();
            reverseString(s2);
            String tmp = new String(s2);
            ans= ans+ tmp+" ";
        }
         return ans.trim();
    }
}
