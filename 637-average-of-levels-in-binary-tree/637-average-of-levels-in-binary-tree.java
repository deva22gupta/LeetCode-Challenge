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


//The number of nodes in the tree is in the range [1, 104].
//-231 <= Node.val <= 231 - 1

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        // classic BFS
        
        List<Double>  result = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum=0.0;
            // FOR A LEVEL IT WILL ADD UP THE AVERAGE VALUE
            for(int i=0;i<n;i++){
                
                  TreeNode node = q.poll();
                sum+=node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                
                
            }
            result.add(sum/n);
        }
        return result;
        
        
    }
}