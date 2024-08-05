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
    public int maxDepth(TreeNode root) {
        // Si el nodo actual es null, la profundidad es 0
        if (root == null) {
            return 0;
        }
        
        // Recursivamente encuentra la profundidad del subárbol izquierdo y derecho
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // La profundidad máxima del nodo actual es el máximo de las profundidades izquierda y derecha más 1
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
