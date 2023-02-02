class Solution {
    static int memo[][];
    public ArrayList<Integer> perfectSquares(int n){
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        int i = 1;
        while((i*i)<=n){
          perfectSquares.add(i*i);
          i++;
        }
        return perfectSquares;
    }
    public int numSquares(int n) {
        ArrayList<Integer> perfectSquares = perfectSquares(n);
        memo = new int[perfectSquares.size()][n+1];
        for(int[]x:memo) Arrays.fill(x,-1);
        return dp(0,n,perfectSquares); 
    }

    public int dp(int i, int n, ArrayList<Integer> perfectSquares){
            if(n<0) return (int)1e9;
            if(n==0) return 0;
            if(i==perfectSquares.size()) return (int)1e9;
            if(memo[i][n]!=-1) return memo[i][n];
            int leave = dp(i+1,n,perfectSquares);
            int take = dp(i,n-perfectSquares.get(i),perfectSquares)+1;
            return memo[i][n]= Math.min(take,leave);
    }
}
