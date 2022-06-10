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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> li = new ArrayList<>();
        
        rightview(li,root,0);
        return li;
        
        
    }
    
    void rightview( List<Integer> li,TreeNode root,int currlevel){
        
        if(root==null) return;
        if(currlevel==li.size()){
            li.add(root.val);
        }
        rightview(li,root.right,currlevel+1);
        rightview(li,root.left,currlevel+1);
        
        
        
    }
    
    
    
    
}