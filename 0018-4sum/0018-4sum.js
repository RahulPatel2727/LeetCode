/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function(nums, target) {
    // Sort the array
    nums.sort((a, b) => a - b);
    
    // Initialize an empty result array
    let result = [];
    
    // Iterate through the array
    for (let i = 0; i < nums.length - 3; i++) {
        // Skip duplicates
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        
        // Set the target for the 3Sum problem to target - nums[i]
        let threeSumTarget = target - nums[i];
        
        // Solve the 3Sum problem
        for (let j = i + 1; j < nums.length - 2; j++) {
            // Skip duplicates
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            
            // Set the pointers to the first and last elements of the remaining array
            let left = j + 1;
            let right = nums.length - 1;
            
            // Solve the 2Sum problem
            while (left < right) {
                // Calculate the current sum
                let sum = nums[j] + nums[left] + nums[right];
                
                // If the sum is equal to the target, add the current combination to the result array
                if (sum == threeSumTarget) {
                    result.push([nums[i], nums[j], nums[left], nums[right]]);
                    
                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move the pointers
                    left++;
                    right--;
                }
                // If the sum is less than the target, move the left pointer
                else if (sum < threeSumTarget) left++;
                // If the sum is greater than the target, move the right pointer
                else right--;
            }
        }
    }
    
    // Return the result array
    return result;
};
