/*
 * @lc app=leetcode id=2864 lang=java
 *
 * [2864] Maximum Odd Binary Number
 */

// @lc code=start
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c1 = 0, c2 = 0;
        for (char a : s.toCharArray()) {
            if(a == '1'){
                c1++;
            }else if(a == '0'){
                c2++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1".repeat(c1 - 1));
        stringBuilder.append("0".repeat(c2));
        stringBuilder.append("1");
        
        return stringBuilder.toString();
    }
}
// @lc code=end

