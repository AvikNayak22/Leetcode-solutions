class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      int inP1 = 0;
      int inP2 = 0;
      int outP1 = 0;
      int outP2 = 0;
        
      while(outP1 < word1.length && outP2 < word2.length)
      {
          String curr1 = word1[outP1];
          String curr2 = word2[outP2];
          
          if(curr1.charAt(inP1)!=curr2.charAt(inP2))
          {
              return false;
          }
          
          if(inP1 < curr1.length()-1)
          {
              inP1++;
          }
          else
          {
              inP1 = 0;
              outP1++;
          }
          
          if(inP2 < curr2.length()-1)
          {
              inP2++;
          }
          else
          {
              inP2 = 0;
              outP2++;
          }  
      }
        
      return outP1 == word1.length && outP2 == word2.length;
    }
}