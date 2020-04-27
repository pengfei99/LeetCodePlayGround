package org.pengfei.problems.algo.P01_TwoSum;

import java.util.HashMap;
import java.util.Map;

/** Solution2 use a hash map to store the array. So we only need to loop the array once. We will use contain
 * to check if there is a possible result in the map, and the look up times is o(1), because map data structure
 *
 * Time complexity : O(2n) , first loop populate the map o(n), second loop find the solution o(n). total is o(2n)
 *
 *
 * Space complexity : O(n+1).
 * */
class Solution02 {
    public static int[] twoSum(int[] nums, int target) {
        //populate the map by using putIfAbsent. So if the array has duplicate value, the map will register the first
        // index, if we use put(), the map will register the last index of the value. But both will be the correct answer.
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],i);
        }

        // second loop
        for(int i=0;i<nums.length;i++){
            int searchVal=target-nums[i];
            // note, the value we search must be different from the current element
            if(map.containsKey(searchVal)&& map.get(searchVal) != i){
                return new int[]{i,map.get(searchVal)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
