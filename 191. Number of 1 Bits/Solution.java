public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
  /*  public int hammingWeight(int n) {
        if(n==0) return 0;
        if((n&1)==1) return 1+hammingWeight(n>>>1);
         else return hammingWeight(n>>>1);
    }
  /*
}
