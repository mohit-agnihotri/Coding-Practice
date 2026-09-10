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
    // int depth = 0 ; 
    // int maxDepth = 0 ;
    // int sum = 0 ;
    public int deepestLeavesSum(TreeNode root) {
        // traverse(root);
        // return sum ;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0 ;
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;
            while(size > 0){
                TreeNode node = q.poll();
                sum += node.val;
                 if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
                size--;
            }
        }
            return sum;
        }
    }
//     void traverse(TreeNode root){
//         if(root == null) return ;
//         depth++;
//         traverse(root.left);
//         traverse(root.right);

//         if(root.left == null && root.right == null){
//             if(depth > maxDepth){
//                 maxDepth = depth;
//                 sum = root.val;
//             } else if(depth == maxDepth){
//                 sum += root.val;
//             }
//         }
//         depth--;
//     }
// }