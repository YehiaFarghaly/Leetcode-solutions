class Solution {
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        List<String> list = new ArrayList<>();
        helper(s.toCharArray(),0,list);
        return list;
    }

    public void helper(char[] s, int idx,List<String> list){
        if(idx==s.length) {
            list.add(new String(s));
            return;
        }
        if(Character.isLetter(s[idx])){
            s[idx]=Character.toUpperCase(s[idx]);
            helper(s,idx+1,list);
            s[idx]=Character.toLowerCase(s[idx]);
            helper(s,idx+1,list);
        }
        else{
            helper(s,idx+1,list);
        }
        
    }
}
