package BinaryTrees;

public class ValidateBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isValidBST(TreeNode root,long min,long max) {
        if(root == null) return true;

        // Root value must be greater than or equal to min and lesser than or equal to max
        if(root.val <= min || root.val >= max) {
            return false;
        }

        boolean isLeftBST = isValidBST(root.left, min, root.val);
        boolean isRightBST = isValidBST(root.right, root.val, max);

        return isLeftBST && isRightBST;
    }
}
