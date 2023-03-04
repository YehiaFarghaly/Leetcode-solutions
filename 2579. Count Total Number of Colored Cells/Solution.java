class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        int ctr = 1;
        while(ctr<n){
            ans+=2*((2*ctr)-1);
        ctr++;
        }
        ans+=(2*n-1);
        return ans;
    }
}
