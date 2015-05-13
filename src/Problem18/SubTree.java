package Problem18;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class SubTree {

public boolean hasSubTree(BinaryTreeNode<Character> rootA, BinaryTreeNode<Character> rootB){
          boolean result = false;
          if(rootA!=null&&rootB!=null){
               if(rootA.getData()!=rootB.getData()){
                    return false;
               }
               else{
               result = isSubTree(rootA,rootB);
               if(!result){
                    result = hasSubTree(rootA.getLeftChild(), rootB);
               }
               if(!result){
                    result = hasSubTree(rootA.getRightChild(),rootB);
               }

          }
          
          }
          return result;
     
     }

private boolean isSubTree(BinaryTreeNode<Character> rootA, BinaryTreeNode<Character> rootB){
     if(rootA == null || rootB == null){
          return false;
     }
     if(rootA.getData() != rootB.getData()){
          return false;
     }
     return isSubTree(rootA.getLeftChild(), rootB.getLeftChild())&&isSubTree(rootA.getLeftChild(), rootB.getRightChild());
     
}

public static void main(String args[]){
	String preOrder = "6892457";
	String inOrder = "9842567";
	ConstructBinaryTree test = new ConstructBinaryTree();
	BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
	String subTreeOrder = "892";
	String subTreeinOrder = "982";
	BinaryTreeNode<Character> subTree = test.constructTree(preOrder,inOrder);
	SubTree test2 = new SubTree();
	System.out.println(test2.hasSubTree(tree, subTree));
	
}
}
