class Solution {
    public boolean isPowerOfTwo(int n) {
        if(Integer.bitCount(n)==1 && n>0) return true;
        return false; 
        // Also we can check (n & (n-1)) == 0
    }
}
