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

 class Quad {
    int max;
    int min;
    int sum;
    boolean isBST;

    Quad(int max, int min,int sum,boolean isBST) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);   
        return maxSum;
    }
    static Quad helper(TreeNode root) {
        if (root == null)
            return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE,0,true);

        Quad leftsubtree = helper(root.left);
        Quad rightsubtree = helper(root.right);

        int maximum = Math.max(root.val,
                Math.max(leftsubtree.max, rightsubtree.max));

        int minimum = Math.min(root.val,
                Math.min(leftsubtree.min, rightsubtree.min));
                
        int sum = root.val + leftsubtree.sum + rightsubtree.sum;

        boolean isBST =  leftsubtree.isBST && rightsubtree.isBST && (leftsubtree.max < root.val) && (rightsubtree.min > root.val);
        if(isBST) maxSum = Math.max(sum,maxSum);
        
        return new Quad(maximum, minimum, sum, isBST);
    }
}