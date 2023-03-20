class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int len = flowerbed.length;
        int prev=0, next;
        for(int i=0; i<len; i++) {
            next= i<len-1 ? flowerbed[i+1] : 0;
            if(flowerbed[i]==0 && prev==0 && next==0){
                flowerbed[i]=1;
                n--;
                if(n==0) break;
            }
            prev=flowerbed[i];
        }
        return n==0;
    }
}
