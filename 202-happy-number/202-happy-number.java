class Solution {
    public static boolean isHappy(int n) {
        HashSet<String> hs = new HashSet<>();
       String s = (n+"");
        while(!hs.contains(s.toString())) {
        	hs.add(s.toString());
        int sum =0;
        for(int i=0;i<s.length();i++) {
            sum+=(s.charAt(i)-'0')*(s.charAt(i)-'0');
        }
        if(sum==1) {
        	return true;
        }
        s = (sum+"");
        }
        return false;
              }
              }