class Solution {
   	public static int findNum(int n) {
		for(int i=0;i<=1000;i++) {
			if((i*(i+1)/2)==n) return i;
			if((i*(i+1)/2)>n) return i-1;
		}
		return 0;
	}
	  public static int maximumGroups(int[] grades) {
	        sort(grades);
	        return findNum(grades.length);
	    }
    	public static void sort(int[] in) {
		shuffle(in);
		Arrays.sort(in);
	}
    	public static void shuffle(int[] in) {
		for (int i = 0; i < in.length; i++) {
			int idx = (int) (Math.random() * in.length);
			int tmp = in[i];
			in[i] = in[idx];
			in[idx] = tmp;
		}
	}
}
