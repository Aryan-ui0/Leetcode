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
    private void leftpre(TreeNode root,List<Integer> l){
        if(root==null){
            l.add(null);
            return;
        } 
        l.add(root.val);
        leftpre(root.left,l);
        leftpre(root.right,l); 
    }
    private void rightpre(TreeNode root,List<Integer> l){
        if(root==null){
            l.add(null);
            return;
        }
        l.add(root.val);
        rightpre(root.right,l); 
        rightpre(root.left,l);
    }
    public boolean isSymmetric(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        leftpre(root.left,l1);
        rightpre(root.right,l2);
        if(l1.equals(l2)) return true;
        return false;
    }
}