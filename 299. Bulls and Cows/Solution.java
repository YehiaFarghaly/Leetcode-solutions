class Solution {
    public String getHint(String secret, String guess) {
        int[]cnt1 = new int[10];
        int[]cnt2 = new int[10];
        for(int i=0;i<secret.length();i++){
            cnt1[secret.charAt(i)-'0']++;
            cnt2[guess.charAt(i)-'0']++;
        }
        int a = 0;
        int b = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                 a++;
                 cnt1[secret.charAt(i)-'0']--;
                 cnt2[secret.charAt(i)-'0']--;
            }
        }
        for(int i=0;i<10;i++){
            b+=Math.min(cnt1[i],cnt2[i]);
        }
        String ans = a+"A"+b+"B";
          return ans;
        }
}
