class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      Map<String,Integer> map = new HashMap<>();
      for(String word : words)
      {
          map.put(word,map.getOrDefault(word,0)+1);
      }
        
      PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>(){
       @Override
       public int compare(String word1,String word2)
       {
          int freq1 = map.get(word1);
          int freq2 = map.get(word2);
           if(freq1 == freq2)
           {
               return word2.compareTo(word1);
           }
           return freq1 - freq2;
       }
      });
        
      for(Map.Entry<String,Integer> entry : map.entrySet())
      {
          pq.add(entry.getKey());
          if(pq.size() > k)
          {
              pq.poll();
          }
      }
        
      List<String> result = new ArrayList<>();
      while(!pq.isEmpty())
      {
          result.add(pq.poll());
      }
      
      Collections.reverse(result);
        
      return result;
      
    }
}