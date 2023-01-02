/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function(nums, target) {
    nums.sort((a, b) => a - b);
    return kSum(nums, target, 0, 4);
};
var kSum  = function (nums,  target,  start,  k) {
    let res = [];

    // If we have run out of numbers to add, return res.
    if (start == nums.length) {
      return res;
    }

    // There are k remaining values to add to the sum. The 
    // average of these values is at least target / k.
    let average_value = target / k;

    // We cannot obtain a sum of target if the smallest value
    // in nums is greater than target / k or if the largest 
    // value in nums is smaller than target / k.
    if (nums[start] > average_value || average_value > nums[nums.length - 1]) {
      return res;
    }

    if (k == 2) {
      return twoSum(nums, target, start);
    }

    for (let i = start; i < nums.length; ++i) {
      if (i == start || nums[i - 1] != nums[i]) {
        for (let subset of kSum(nums, target - nums[i], i + 1, k - 1)) {
          res.push([nums[i], ...subset]);
        }
      }
    }

    return res;
  }

 var twoSum = function(nums, target,  start) {
    let res = [];
    let s = new Set();

    for (let i = start; i < nums.length; ++i) {
      if (res.length == 0 || res[res.length - 1][1] != nums[i]) {
        if (s.has(target - nums[i])) {
          res.push([target - nums[i], nums[i]]);
        }
      }
      s.add(nums[i]);
    }

    return res;
  }