package org.pengfei.problems.algo.P01_TwoSum;

import java.util.HashMap;
import java.util.Map;

/** Solution3 is an improvement of solution 2. We just loop the array once. We exam the value and populate the map
 * at same time. In this case, the second value's index is always less than the first value's index. Its like
 * we look back at the map*/
class Solution03 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int searchVal=target-nums[i];
            // check if map contains the search value or not
            if(map.containsKey(searchVal)) return new int[]{
             map.get(searchVal),i
            };
            //if not just populate current value to map
            map.putIfAbsent(nums[i],i);
        }
        // if no result found, throw exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
