class Solution {
       public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {
            
                  // return comparison results of values of
                  // two keys
                  public int compare(K k2, K k1)
                  {
                      int comp = map.get(k1).compareTo(
                          map.get(k2));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
            
              };
        
        // SortedMap created using the comparator
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(map);
        
        return sorted;
    }
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        for(int i=0;i<words.length;i++){
            tm.put(words[i],tm.getOrDefault(words[i],0)+1);
        }
        Map<String,Integer> map = valueSort(tm);
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            ans.add(entry.getKey());
            k--;
            if(k==0) break;
        }
        return ans; 
    }
}
