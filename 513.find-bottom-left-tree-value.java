/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class TreeNode{
    int Value;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        Value = val;
    }

    TreeNode(int x, TreeNode left, TreeNode right){
        Value = x;
        this.left = left;
        this.right = right;
    }

}

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode leftMost = null;

        while (!queue.isEmpty()) {
            leftMost = queue.poll();

            if(leftMost.right != null){
                queue.offer(leftMost.right);
            }

            if(leftMost.left != null){
                queue.offer(leftMost.left);
            }
        }

        return leftMost.Value;
    }
}
// @lc code=end

