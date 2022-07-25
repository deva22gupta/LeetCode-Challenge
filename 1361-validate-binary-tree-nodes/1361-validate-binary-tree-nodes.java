class Solution {
   public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
	Map<Integer,TreeNode> map = new HashMap<>();
	for(int i=0;i<n;i++)map.put(i,new TreeNode(i));
	TreeNode  root = map.get(0);  //initially assume root to be node 0
	for(int i=0;i<n;i++){
		TreeNode x = map.get(i);
		if(leftChild[i]!=-1){
			x.left = map.get(leftChild[i]);
			if(leftChild[i]==root.data)root=x;  // update  root if any
		}
		if(rightChild[i]!=-1){
			x.right = map.get(rightChild[i]);
			if(rightChild[i]==root.data)root = x;   //update root if any 
		}
	}
	boolean[] isVisited = new boolean[n];
	if(!preOrder(root,isVisited))return false;
	for(boolean ele : isVisited)if(!ele)return false;
	return true;
}
private boolean preOrder(TreeNode root,boolean[] isVisited ){
	if(root==null)return true;
	if(isVisited[root.data])return false;
	isVisited[root.data] = true;
	return preOrder(root.left,isVisited) && preOrder(root.right,isVisited);
}

   class TreeNode{
       int data;
      public TreeNode(int data){
	   this.data = data;
     }
      TreeNode left;
       TreeNode right;
   }
}