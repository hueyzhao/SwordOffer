package Problem6;

import Common.BinaryTree.BinaryTreeNode;

public class ConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preOrder = "12473568";
		String inOrder = "47215386";
		ConstructBinaryTree test = new ConstructBinaryTree();
		BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
//		BinaryTreeNode<Character> tree = test.constructCore(preOrder,inOrder, 0, preOrder.length()-1,0,inOrder.length()-1);
		test.preOrder(tree);
	}
	public BinaryTreeNode<Character> constructTree(String preOrder,String inOrder){
		if(preOrder == null || inOrder == null || preOrder.length() != inOrder.length()){
			System.out.println("input is invalid.");
			return null;
		}
			
		return constructCore(preOrder,inOrder);
		
	}
	
	public BinaryTreeNode<Character> constructCore(String preOrder,String inOrder){
		if(preOrder.equals("")||inOrder.equals(""))
			return null;
		char rootValue = preOrder.charAt(0);
		String subLeftPre = null;
		String subLeftIn = null;
		String subRightPre = null;
		String subRightIn = null;
		BinaryTreeNode<Character> rootNode = new BinaryTreeNode<Character>(rootValue, null,null);
		int rootIndex = inOrder.indexOf(rootValue);
		if(rootIndex>0){
		 subLeftPre = preOrder.substring(1,1 + rootIndex);
		 subLeftIn = inOrder.substring(0, rootIndex);
		}
		if((rootIndex+1) < (preOrder.length())){
		 subRightPre = preOrder.substring(rootIndex+1, preOrder.length());//substring need index +1
		 subRightIn = inOrder.substring(rootIndex+1,inOrder.length());
		}
		if(subLeftPre!=null&& subLeftIn != null && !(subLeftPre.equals("") ) && !(subLeftIn.equals("")))
			rootNode.setLeftChild(constructCore(subLeftPre, subLeftIn));
		if(subRightPre != null && subRightIn != null &&!(subRightPre.equals("")) && !(subRightIn.equals("")))
			rootNode.setRightChild(constructCore(subRightPre,subRightIn));
		return rootNode;
	}
	public void preOrder(BinaryTreeNode<Character> rootNode){
		if(rootNode!=null){
			System.out.println(rootNode.getData());
			if(rootNode.getLeftChild() != null)
				preOrder(rootNode.getLeftChild());
			if(rootNode.getRightChild() != null)
				preOrder(rootNode.getRightChild());
		}
	}
	/**
	 * this method doesn't create duplicated strings
	 * Note that preOrder index need to be calculated with "rootIndex" and leftLength
	 */
	private BinaryTreeNode<Character> constructCore(String preOrder, String inOrder, int preOrderStart, int preOrderEnd, int inOrderStart, int inOrderEnd){
		
		if(preOrder == null || inOrder == null)
			return null;
		if(preOrder.length()!=inOrder.length())
			return null;
		if(preOrderStart < 0 || preOrderStart > preOrder.length() || inOrderStart < 0 || inOrderEnd > inOrder.length())
			return null;
		if(preOrderStart > preOrderEnd || inOrderStart > inOrderEnd)
			return null;
		int preLength = preOrderEnd - preOrderStart;
		int inOrderLength = inOrderEnd - inOrderStart;
		if(preLength != inOrderLength)
			return null;
		char [] preOrderArray = preOrder.toCharArray();
		char [] inOrderArray = inOrder.toCharArray();
		char rootChar = preOrderArray[preOrderStart];
		int rootIndex = returnCharIndex(inOrderArray, rootChar, inOrderStart, inOrderEnd);
		int leftLength = rootIndex - inOrderStart;
		if(rootIndex == -1)
			return null;
		BinaryTreeNode<Character> root = new BinaryTreeNode<Character>(rootChar, null, null);
		if(preLength >0)
			root.setLeftChild(constructCore(preOrder,inOrder,preOrderStart+1, preOrderStart + leftLength,inOrderStart,rootIndex-1));
		if(inOrderLength > 0)
			root.setRightChild(constructCore(preOrder, inOrder, preOrderStart + leftLength + 1, preOrderEnd, rootIndex+1, inOrderEnd));
		return root;
	}
	
	private int returnCharIndex(char [] array, char data, int startIndex, int endIndex){
		if(array == null)
			return -1;
		if(startIndex<0 || startIndex > array.length || endIndex < 0 || endIndex > array.length)
			return -1;
		if(startIndex > endIndex)
			return -1;
		int index = -1;
		for(int i =startIndex; i <=endIndex; i++){
			if(array[i] == data)
				index = i;
		}
		return index;
	}

}
