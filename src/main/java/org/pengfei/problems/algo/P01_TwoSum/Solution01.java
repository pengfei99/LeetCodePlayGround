package org.pengfei.problems.algo.P01_TwoSum;


/** Solution 1 uses brutal force just loop over all element until it finds the correct answer
 *
 * Complexity Analysis
 *
 * Time complexity : O(n^2)
 * For each element, we try to find its complement by looping through the rest of array
 * which takes O(n) time. Therefore, the time complexity is O(n^2).
 *
 * Space complexity : O(1).
 * */
 class Solution01 {
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
