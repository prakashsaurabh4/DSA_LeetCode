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
    private void revinorder(TreeNode root, ArrayList<TreeNode> arr) {
        if(root == null) return;
        revinorder(root.right, arr);
        arr.add(root);
        revinorder(root.left, arr);
    }

    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        revinorder(root, arr);

        int sum = 0;

        for(int i = 0; i < arr.size(); i++) {
            int value = arr.get(i).val;
            sum += value;
            arr.get(i).val = sum;
        }

        return root;
    }
}