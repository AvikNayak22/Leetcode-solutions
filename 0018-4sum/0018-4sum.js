/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */

var fourSum = function (nums, target) {
  let result = [];
  nums.sort((a, b) => a - b);

  for (let i = 0; i < nums.length - 3; i++)
  {
    if (i > 0 && nums[i] === nums[i - 1]) 
    {
      // skip the same result
      continue;
    }
    if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
    {
      // the sum is too large
      break;
    }
    if (
      nums[i] +
        nums[nums.length - 3] +
        nums[nums.length - 2] +
        nums[nums.length - 1] <
      target
    )
    {
      // the sum is too small
      continue;
    }
    for (let j = i + 1; j < nums.length - 2; j++) 
    {
      if (j > i + 1 && nums[j] === nums[j - 1])
      {
        // skip the same result
        continue;
      }
      if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
      {
        // the sum is too large
        break;
      }
      if (
        nums[i] + nums[j] + nums[nums.length - 2] + nums[nums.length - 1] <
        target
      ) 
      {
        // the sum is too small
        continue;
      }
      let left = j + 1;
      let right = nums.length - 1;
      while (left < right) {
        let sum = nums[i] + nums[j] + nums[left] + nums[right];
        if (sum === target) {
          result.push([nums[i], nums[j], nums[left], nums[right]]);
          left++;
          right--;
          while (left < right && nums[left] === nums[left - 1]) {
            left++;
          }
          while (left < right && nums[right] === nums[right + 1]) {
            right--;
          }
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }
  }
  return result;
}
