class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> list = new ArrayList<>();
          makeAllCombinations(candidates,target,0,new ArrayList<>(),list);
          return list;        
    }

    void makeAllCombinations(int[] candidates, int target, int index,List<Integer> current ,List<List<Integer>> answer){
        if(index==candidates.length){
        if(target==0){
            answer.add(new ArrayList<>(current));
        }
        return;
        }
         if(candidates[index]<=target){
           current.add(candidates[index]);
           makeAllCombinations(candidates,target-candidates[index],index,current,answer);
           current.remove(current.size()-1);
        }
        makeAllCombinations(candidates,target,index+1,current,answer);
    }
}
