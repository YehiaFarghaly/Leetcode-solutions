class Solution {
 	   public static boolean isIsomorphic(String s, String t) {
	       return valid(s,t)&& valid(t,s);
	    }

	    public static boolean valid(String s, String t){
	         HashMap<Character,HashSet<Character>> hm = new HashMap<>();
	         boolean valid = true;
	         for(int i=0;i<s.length();i++){
	             HashSet<Character> hs = new HashSet<>();
	             hm.put(s.charAt(i),hs);
	         }
	         for(int i=0;i<s.length();i++){
	        	 hm.get(s.charAt(i)).add(t.charAt(i));
	             if(hm.get(s.charAt(i)).size()>1) valid = false;
	         }

	        return valid;
	    }
	
}
