package BinaryTree;

public class ConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preOrder = "12473568";
		String inOrder = "47215386";
		ConstructBinaryTree test = new ConstructBinaryTree();
		BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
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

}
