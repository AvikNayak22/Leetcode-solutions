class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();//to avoid duplicates
        int res = 0, extra = 0;
        
        for(String word : words) map.merge(word, 1, Integer::sum);//count frequency
        
        for(String key : map.keySet()) {
            if(!set.add(key)) continue;//already dealt with

            if(key.charAt(0) == key.charAt(1)) {//case 1 symmetric
                res += map.get(key) / 2;//get even
                if(map.get(key) % 2 == 1)//odd frequency we can use it in middle hence extra 2 length
                    extra = 2;
            } else {//case 2 asymmetric 
                String rev = "" + key.charAt(1) + key.charAt(0);//create reverse string

                if(!map.containsKey(rev)) continue;//doesn't exist in map

                res += Math.min(map.get(key), map.get(rev));//pick minimum outta key and it's reverse
                set.add(rev);//mark as visited
            }
         }
        return res * 4 + extra;
    }
}