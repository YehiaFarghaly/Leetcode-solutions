class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i=num.length-1;i>-1;i--){
            k+=num[i];
            ans.addFirst(k%10);
            k/=10;
        }
        while(k>0){
            ans.addFirst(k%10);
            k/=10;
        }
        return ans;
    }
}
