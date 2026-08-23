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
    public void flatten(TreeNode root) {
      if(root==null) return;
     TreeNode l = root.left;
     TreeNode r = root.right;
     root.left = null;
     root.right = null;
     flatten(l);
     flatten(r);
     root.right = l;
     TreeNode last = root; // last element of l
     while(last.right!=null) last = last.right;
     last.right=r;  
    }
}