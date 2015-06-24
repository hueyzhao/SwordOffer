package Problem39;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class DeepthOfTree<T> {
	private int balanceDeepth = 0;
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
	/**
	 * post order 
	 * @param root
	 * @return
	 */
	public boolean isBalanceTree(BinaryTreeNode<T> root){
		if(root == null){
			return true;
		}
		BalanceResult isBalanced = isBalanced(root);
		return isBalanced.isBalanced();
		
	}
	
	private BalanceResult isBalanced(BinaryTreeNode<T> root){
		if(root == null){
			return null;
		}
		int left = 0;
		int right = 0;
		int deepth = 0;
		BalanceResult leftResult = isBalanced(root.getLeftChild());
		BalanceResult rightResult = isBalanced(root.getRightChild());
		left = leftResult.getDeepth();
		right = rightResult.getDeepth();
		if(leftResult.isBalanced()&&rightResult.isBalanced()){
			
			int diff = left - right;
			if(diff <=1 || diff >= -1){
				BalanceResult balance = new BalanceResult();
				balance.setBalanced(true);
				deepth = (left>right) ? (left+1) : (right+1);
				balance.setDeepth(deepth);
				return balance;
			}
		}
		BalanceResult falseResult = new BalanceResult();
		falseResult.setBalanced(false);
		deepth = (left>right) ? (left+1) : (right+1);
		falseResult.setDeepth(deepth);
		return falseResult;
	}

}
