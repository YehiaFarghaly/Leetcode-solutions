class Solution {
    public int maxArea(int[] height) {
        int pt1 = 0;
        int pt2 = height.length-1;
        TreeSet<Integer> ts = new TreeSet();
    while(pt2>pt1){
        int width = pt2-pt1;
        int h = Math.min(height[pt1],height[pt2]);
        ts.add(width*h);
       if(height[pt1]>height[pt2]) pt2--; else pt1++;
    }
        return ts.last();
    }
}