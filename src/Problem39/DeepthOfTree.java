package Problem39;

import Common.BinaryTree.BinaryTreeNode;

public class DeepthOfTree<T> {
	private int treeDepth = 0;
	private int maxDepth = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getDepth(BinaryTreeNode<T> binaryTree){
		if(binaryTree == null)
			return -1;
		
		if(binaryTree.getLeftChild()!=null) maxDepth++;
		if(maxDepth>treeDepth) treeDepth = maxDepth;
		getDepth(binaryTree.getLeftChild());
		if(binaryTree.getRightChild()!=null) maxDepth++;
		getDepth(binaryTree.getRightChild());
		return treeDepth;
	}

}
