class Solution {
    public String decodeString(String s) {
      Stack<Integer> countStack = new Stack<>();
      Stack<String> wordStack = new Stack<>();
      int number = 0;
      StringBuilder word = new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
          char c = s.charAt(i);
          if(Character.isDigit(c))
          {
             number = number * 10 + (c -'0'); 
          }
          else if(Character.isLetter(c))
          {
              word.append(c);
          }
          else if( c== '[')
          {
             countStack.add(number);
             wordStack.add(word.toString());
             number = 0;
             word = new StringBuilder();
          }
          else
          {
              int count = countStack.pop();
              StringBuilder duplicatedWord = new StringBuilder(wordStack.pop());
              for(int it=1;it<=count;it++)
              {
                  duplicatedWord.append(word);
              }
              word = duplicatedWord;
          }
      }
      return word.toString();
    }
}