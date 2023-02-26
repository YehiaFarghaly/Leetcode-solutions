class Solution {
    static int memo[][];
    public int minDistance(String word1, String word2) {
        memo = new int[word1.length()+1][word2.length()+1];
        for(int[]x:memo) Arrays.fill(x,-1);
        return dp(0,0,word1,word2);
    }
    public int dp(int i, int j, String word1, String word2){
        if(i==word1.length() && j==word2.length()) return 0;
        // If one of the indices is larger than the length of its string we will return so large number to skip this try
        if(i>word1.length() || j>word2.length()) return (int)1e9;
        if(memo[i][j]!=-1) return memo[i][j];
        // Note that each operation is counted as 1 so we add one to our function call each time
        int insert = dp(i,j+1,word1,word2)+1;
        int delete = dp(i+1,j,word1,word2)+1;
        int replace = dp(i+1,j+1,word1,word2)+1;
        // check first that i!=word1.length() and j!=word2.length() as it is possible that we reach the end of word2 as example and the best solution is to delete the last character of word1
        if(i<word1.length() && j<word2.length() && word1.charAt(i)==word2.charAt(j)){
        // Skip costs nothing so we didnt add 1 to it
            int skip = dp(i+1,j+1,word1,word2);
            return memo[i][j] = Math.min(Math.min(insert,delete),Math.min(replace,skip));
        }
        return memo[i][j] =  Math.min(Math.min(insert,delete),replace);
    }
}
