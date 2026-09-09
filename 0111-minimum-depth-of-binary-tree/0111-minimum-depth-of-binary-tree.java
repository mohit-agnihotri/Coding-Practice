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
    int depth = 0 ;
    int min = Integer.MAX_VALUE ; 
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        traverse(root);
        return min;
    }
    void traverse(TreeNode root){
        if(root == null) return ;
        depth++;
        traverse(root.left);
        traverse(root.right);
        if(root.left == null && root.right == null){
            min = Math.min(depth , min);
        }
        depth--;
    }
}