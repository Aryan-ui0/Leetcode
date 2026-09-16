class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> fir = new LinkedList<>();
        Queue<TreeNode> sec = new LinkedList<>();

        fir.offer(p);
        sec.offer(q);

        while (!fir.isEmpty() && !sec.isEmpty()) {

            TreeNode currf = fir.poll();
            TreeNode currs = sec.poll();

            if (currf.val != currs.val) return false;

            if (currf.left != null && currs.left != null) {
                fir.offer(currf.left);
                sec.offer(currs.left);
            } 
            else if (currf.left != null || currs.left != null) {
                return false;
            }

            if (currf.right != null && currs.right != null) {
                fir.offer(currf.right);
                sec.offer(currs.right);
            } 
            else if (currf.right != null || currs.right != null) {
                return false;
            }
        }

        return true;
    }
}