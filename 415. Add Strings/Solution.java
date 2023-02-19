class Solution {
    public String addStrings(String num1, String num2) {
        int ptr1 = num1.length()-1;
        int ptr2 = num2.length()-1;
        String ans = "";
        int carry = 0;
        while(ptr1>=0 && ptr2>=0){
            int s = (num1.charAt(ptr1)-'0')+(num2.charAt(ptr2)-'0')+carry;
            int sum = s%10;
             carry = s/10;
            ans = sum+ans;
            ptr1--;
            ptr2--;
        }
        String bigger = num1.length()<num2.length()?num2:num1;
        int newPtr = ptr1<0?ptr2:ptr1;
        if(carry!=0 && newPtr>-1){
            for(int i=newPtr;i>-1;i--){
                int s = (bigger.charAt(i)-'0')+carry;
                int sum = s%10;
                carry = s/10;
                ans = sum+ans;
            }
            if(carry!=0) ans = carry+ans;
                
        }
        else if(carry!=0) ans = carry+ans;
        else    
                ans = bigger.substring(0,newPtr+1)+ans;
        
        return ans;
    }
}
