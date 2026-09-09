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
    int maxDepth = 0 ;
    int sum = 0 ;
    public int deepestLeavesSum(TreeNode root) {
        traverse(root);
        return sum ;
    }
    void traverse(TreeNode root){
        if(root == null) return ;
        depth++;
        traverse(root.left);
        traverse(root.right);

        if(root.left == null && root.right == null){
            if(depth > maxDepth){
                maxDepth = depth;
                sum = root.val;
            } else if(depth == maxDepth){
                sum += root.val;
            }
        }
        depth--;
    }
}