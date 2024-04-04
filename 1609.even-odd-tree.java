/*
 * @lc app=leetcode id=1609 lang=java
 *
 * [1609] Even Odd Tree
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;


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
public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return true; // Empty tree is an even-odd tree
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int[] temp = new int[size];

            // Process each node in the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                temp[i] = current.val;

                // Enqueue child nodes for the next level
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

            // Check values at the current level based on the level's parity
            for (int i = 0; i < temp.length; i++) {
                // For even levels, values should be odd and strictly increasing
                // For odd levels, values should be even and strictly decreasing
                if ((level % 2 == 0 && (temp[i] % 2 != 1 || (i > 0 && temp[i] <= temp[i - 1]))) ||
                    (level % 2 != 0 && (temp[i] % 2 != 0 || (i > 0 && temp[i] >= temp[i - 1])))) {
                    return false; // Not an even-odd tree
                }
            }

            level++;
        }

        return true; // The tree is an even-odd tree
    }
}
// @lc code=end

