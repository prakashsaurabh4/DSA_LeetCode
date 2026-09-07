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
// class Solution {
//     public void flatten(TreeNode root) {
//       if(root==null) return;
//      TreeNode l = root.left;
//      TreeNode r = root.right;
//      root.left = null;
//      root.right = null;
//      flatten(l);
//      flatten(r);
//      root.right = l;
//      TreeNode last = root; // last element of l
//      while(last.right!=null) last = last.right;
//      last.right=r;  
//     }
// }

// class Solution {
//     public void flatten(TreeNode root) {
//        if (root == null) return;

//         ArrayList<TreeNode> arr = new ArrayList<>();

//         dfs(root, arr);

//         for (int i = 0; i < arr.size() - 1; i++) {
//             TreeNode a = arr.get(i);
//             TreeNode b = arr.get(i + 1);

//             a.left = null;
//             a.right = b;
//         }

//         TreeNode last = arr.get(arr.size() - 1);
//         last.left = null;
//         last.right = null;
//     }

//     private static void dfs(TreeNode root, ArrayList<TreeNode> arr) {
//         if (root == null) return;

//         arr.add(root);
//         dfs(root.left, arr);
//         dfs(root.right, arr);
//     }
// }

class Solution {
    public void flatten(TreeNode root) {
    TreeNode curr = root;
     while(curr != null){
          if(curr.left != null){
              TreeNode pred = curr.left;
              while(pred.right != null) pred = pred.right;
              pred.right = curr.right;
              curr.right = curr.left;
              curr.left = null;
              curr = curr.right;
          }
          else {
              curr = curr.right;
          }
      }
    }
}