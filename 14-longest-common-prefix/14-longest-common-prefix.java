class Solution {
  public String longestCommonPrefix(String[] strs) {
	        StringBuilder ret = new StringBuilder();
	      int minLength = 500;
	        for(int i=0;i<strs.length;i++) {
	            if(strs[i].length()<minLength) {
	            	minLength=strs[i].length();
	            }
	        }
	      w:  for(int i=0;i<minLength;i++) {
	        	boolean f = true;
	        	for(int j=0;j<strs.length-1;j++) {
	        		if(strs[j].charAt(i)!=strs[j+1].charAt(i)) {
	        			break w;
	        		}
	        	}
	        	if(f) ret.append(strs[0].charAt(i));
	        }
	        return ret.toString();
	    }
}