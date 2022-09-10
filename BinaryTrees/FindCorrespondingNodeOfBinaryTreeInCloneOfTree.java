package BinaryTrees;

class TreeNode {
    TreeNode left,right;
}

public class FindCorrespondingNodeOfBinaryTreeInCloneOfTree {
    TreeNode ref = null;

    public void inorder(TreeNode original,TreeNode copy,TreeNode target) {
        if(original != null) {
            inorder(original.left,copy.left,target);
            if(original == target) {
                ref = copy;
            }
            inorder(original.right,copy.right,target);
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorder(original,cloned,target);
        return ref;
    }
}
