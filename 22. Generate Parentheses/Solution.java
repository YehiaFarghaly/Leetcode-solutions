class Solution {
     public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        findAll("(",1,0,res,n);

        return res;
    }

   public void findAll(String current,int open , int close , List<String> res, int n){
        if(current.length()==2*n){
            res.add(current);
            return;
        }
        if(open<n)
        findAll(current+"(", open+1,close,res,n);
        if(close<open)
        findAll(current+")",open,close+1,res,n);
    }
}
