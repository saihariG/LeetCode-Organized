package BinaryTrees;

public class ConvertSortedArrayToBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return createHeightBalancedTree(nums,0,nums.length-1);
    }

    static TreeNode createHeightBalancedTree(int[] nums, int low,int high) {

        if(low > high) return null;

        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = createHeightBalancedTree(nums,low,mid-1);
        root.right = createHeightBalancedTree(nums,mid+1,high);

        return root;
    }
}
