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
    int ans;
    public int goodNodes(TreeNode root) {
        ans = 0;
        int maxTillNow = Integer.MIN_VALUE;
        getCount(root, maxTillNow);
        return ans;
    }
    public void getCount(TreeNode root, int max){
        if(root == null) return;

        if(root.val >= max) ans++;
        getCount(root.left, Math.max(max, root.val));
        getCount(root.right, Math.max(max, root.val));
    }
}