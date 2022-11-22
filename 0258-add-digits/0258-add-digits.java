class Solution {
    int getDigitsSum(int n){
        String s = n+"";
        int res = 0;
        for(int i=0;i<s.length();i++){
            res+=(s.charAt(i)-'0');
        }
        return res;
    }
    public int addDigits(int num) {
        if(num/10==0) return num;
        return addDigits(getDigitsSum(num));
    }
}