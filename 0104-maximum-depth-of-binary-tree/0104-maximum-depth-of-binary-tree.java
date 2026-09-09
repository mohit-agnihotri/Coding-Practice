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
class Solution {
    int depth = 0;
    int max = 0;

    public int maxDepth(TreeNode root) {

        traverse(root);
        return max;
    }

    void traverse(TreeNode root) {
        if (root == null)
            return;
        depth++;
        traverse(root.left);
        traverse(root.right);
        max = Math.max(depth, max);
        depth--;
    }
}