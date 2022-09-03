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
    int count=0;
    public int goodNodes(TreeNode root) {
     
     //   int count=0;
        
         preOrder(root,Integer.MIN_VALUE);
        
        return count;
        
    }
    
    void preOrder(TreeNode root,int max){
        if(root==null) return;
        // check for max
        if(root.val>=max){
            count++;
            max=Math.max(root.val,max);
        }
        
        preOrder(root.left,max);
        preOrder(root.right,max);
        
        
    }
}