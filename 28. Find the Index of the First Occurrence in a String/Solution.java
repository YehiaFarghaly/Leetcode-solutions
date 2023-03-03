class Solution {
    public int strStr(String haystack, String needle) {
        String h = haystack;
        String n = needle;
        for(int i=0;i<h.length()-n.length()+1;i++){
       if(h.substring(i,i+n.length()).equals(n)) return i;
        }
        return -1;
    }
}
