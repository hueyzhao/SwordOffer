package Problem39;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class DeepthOfTree<T> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preOrder = "12345";
		String inOrder = "12345";
		ConstructBinaryTree test = new ConstructBinaryTree();
		BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
		DeepthOfTree<Character> testTree = new DeepthOfTree<Character>();
		System.out.println(testTree.getDepth(tree));
	}
	public int getDepth(BinaryTreeNode<T> binaryTree){
		if(binaryTree == null)
			return 0;
		
		int leftDepth = getDepth(binaryTree.getLeftChild());
		int rightDepth = getDepth(binaryTree.getRightChild());
		return (leftDepth > rightDepth)?(leftDepth + 1):(rightDepth + 1);
	}

}
