/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();

        backtrakig(list, "", 0, 0, n);

        return list;
    }

    public void backtrakig(List<String> list, String str, int start, int end, int max){
        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(start < max){
            backtrakig(list, str + "(", start + 1, end, max);
        }
        if(end < start){
            backtrakig(list, str+")", start, end+1, max);
        }
    }
}
// @lc code=end

