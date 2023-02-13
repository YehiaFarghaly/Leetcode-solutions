class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(n,k,1,res,new ArrayList<>());
        return res;
    }

    public void helper(int n, int k, int idx ,List<List<Integer>> res, List<Integer> list ){
        if(list.size()==k) {
            res.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=idx;i<=n;i++){
                list.add(i);
                helper(n,k,i+1,res,list);
                list.remove(list.size()-1);
            }
        }
    }
}
