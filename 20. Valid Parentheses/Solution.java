class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean valid = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(') st.pop();
            else if(s.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{') st.pop();
            else if(s.charAt(i)==']' && !st.isEmpty() && st.peek()=='[') st.pop();
            else valid = false;
        }
        return valid&&st.isEmpty();
    }
}
