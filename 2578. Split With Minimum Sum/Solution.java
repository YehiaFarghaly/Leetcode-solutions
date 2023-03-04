class Solution {
    public int splitNum(int num) {
    PriorityQueue<Character> pq = new PriorityQueue<>();
        String s = num+"";
        for(int i=0;i<s.length();i++){
            pq.add(s.charAt(i));
        }
        String s1 = "";
        String s2 = "";
        boolean first = true;
        while(!pq.isEmpty()){
            if(first) {
                s1+=pq.remove();
            }
            else{
                s2+=pq.remove();
            }
            first=!first;
        }
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
}
