class Solution {
    Boolean isVowel(char c)
    {
         if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')return true;
        return false;
    }
    public String reverseVowels(String s) {
       int start = 0;
       int end = s.length()-1;
        
        char[] charArr = s.toCharArray();
        
        while(start < end)
        {
            if(!isVowel(charArr[start]))
            {
                start++;
                continue;
            }
            
            if(!isVowel(charArr[end]))
            {
                end--;
                continue;
            }
            
            char c = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = c;
            
            start++;
            end--;
        }
        
        return new String(charArr);
    }
}