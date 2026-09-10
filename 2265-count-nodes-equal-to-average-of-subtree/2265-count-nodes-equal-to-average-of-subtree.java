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
    private int totalcount = 0;

    private int[] traverse(TreeNode root) {
        if (root == null)
            return new int[] { 0, 0 };
        int left[] = traverse(root.left);
        int right[] = traverse(root.right);
        int subtreesum = left[0] + right[0] + root.val;
        int sumnodecount = left[1] + right[1] + 1;
        int avg = subtreesum / sumnodecount;
        if (avg == root.val)
            totalcount++;
        return new int[] { subtreesum, sumnodecount };

    }

    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return totalcount;
    }
}