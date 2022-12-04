/**
 * @param {string} digits
 * @return {string[]}
 */
const letterCombinations = (digits) => {
  if (digits.length === 0) return [];
  let result = [];
  const map = {
    '2': ['a','b','c'],
    '3': ['d','e','f'],
    '4': ['g','h','i'],
    '5': ['j','k','l'],
    '6': ['m','n','o'],
    '7': ['p','q','r','s'],
    '8': ['t','u','v'],
    '9': ['w','x','y','z'],
  };
  
  const recurse = (word, index) => {
    if (word.length === digits.length) {
      result.push(word);
      return;
    }
    
    for (let i = 0; i < map[digits[index]].length; i++) {
      recurse(word + map[digits[index]][i], index + 1);
    }
  };
  
  recurse("", 0);
  return result;
};