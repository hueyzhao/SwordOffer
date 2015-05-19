package Problem27;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class ConvertTree2DoubleLink<T> {

		  private boolean first = true;
          private BinaryTreeNode<T> head; 
          private BinaryTreeNode<T> lastInList;
          private void convertTree(BinaryTreeNode<T> root){
               if(root == null)
                    return;
          if(root.getLeftChild()!=null)
               convertTree(root.getLeftChild());
          BinaryTreeNode<T> current = root;
          if(this.lastInList!=null){
               current.setLeftChild(lastInList);
               lastInList.setRightChild(current);
          }
          if(this.first){
               this.first = false;
               this.head = current;
          }
          lastInList = current;
          if(root.getRightChild()!=null)
               convertTree(root.getRightChild());
     }

      public BinaryTreeNode<T> convertTreetoDoubleList(BinaryTreeNode<T> root){
          convertTree(root);
          return this.head;
     }
      public static void main(String [] args){
    	  String preOrder = "123456789";
			String inOrder = "123456789";
			ConstructBinaryTree test = new ConstructBinaryTree();
			BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
			ConvertTree2DoubleLink<Character> convertTree = new ConvertTree2DoubleLink<Character>();
			BinaryTreeNode<Character> head = convertTree.convertTreetoDoubleList(tree);
			while(head!=null){
				System.out.print(head.getData() + " ");
				head = head.getRightChild();
			}
      }
}
