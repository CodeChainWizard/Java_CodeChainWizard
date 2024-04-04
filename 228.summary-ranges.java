/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]+1){
                if(start == nums[i-1]){
                    list.add(Integer.toString(start));
                }else{
                    list.add(start + "->" +nums[i-1]);
                }
                start = nums[i];
            }
        }

        if(start == nums[nums.length - 1]){
            list.add(Integer.toString(start));
        }else{
            list.add(start + "->" + nums[nums.length-1]);
        }
        return list;
    }
}
// @lc code=end

