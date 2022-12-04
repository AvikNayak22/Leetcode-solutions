/**
 * @param {string} s
 * @return {boolean}
 */

var isValid = function(s){
  let stack = [];
  const pairs = {
    '(': ')',
    '{': '}',
    '[': ']'
  };

  for (let i = 0; i < s.length; i++) {
    let char = s[i];
    if (pairs[char]) {
      stack.push(char);
    } else if (char !== pairs[stack.pop()]) {
      return false;
    }
  }

  return stack.length === 0;
}