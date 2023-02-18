class Solution {
    public boolean isAnagram(String s, String p){
        int[]arr1 = new int[27];
        int[]arr2 = new int[27];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            arr2[p.charAt(i)-'a']++;
        }
        for(int i=0;i<27;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashSet<Character> hs = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            hs.add(p.charAt(i));
        }
        for(int i=0;i<=s.length()-p.length();i++){
              if(hs.contains(s.charAt(i))){
                    if(isAnagram(s.substring(i,i+p.length()),p)){
                        ans.add(i);
                    }
              }
        }
        return ans;
    }
}
