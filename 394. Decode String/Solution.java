class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                StringBuilder sb = new StringBuilder();
                while(s.charAt(i)!='['){
                    sb.append(s.charAt(i++));
                }
                nums.push(Integer.parseInt(sb.toString()));
            }
            if(s.charAt(i)!=']') st.push(s.charAt(i));
            else {
                StringBuilder sb= new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                sb.reverse();
                int ctr = nums.pop();
                while(ctr-->0){
                    for(int j=0;j<sb.length();j++){
                        st.push(sb.charAt(j));
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}
