class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack();
        int pop = 0;
        for(int i=0;i<pushed.length;i++){
               st.push(pushed[i]);      
            
               while(st.peek()==popped[pop]){
               st.pop();
               pop++;
               if(st.isEmpty()) break;
               } 
               
        
    }
    while(!st.isEmpty()){
        if(popped[pop]==st.peek()) {
        st.pop();
        pop++;
        }
        else break;
    }
    if(st.isEmpty()) return true;
    return false;
}
}
