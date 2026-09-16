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
    private boolean check(TreeNode root,int num){
        if(root==null) return true;
        if(root.val!=num) return false;
        return check(root.left,num) && check(root.right,num);
    }
    public boolean isUnivalTree(TreeNode root) {
        int num = root.val;
        return check(root,num);
    }
}