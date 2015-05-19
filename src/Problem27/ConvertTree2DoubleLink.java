package Problem27;

import Common.BinaryTree.BinaryTreeNode;

public class ConvertTree2DoubleLink<T> {

		  private boolean first = true;
          private BinaryTreeNode<T> head; 

          public void convertTree(BinaryTreeNode<T> root, BinaryTreeNode<T> lastInList){
               if(root == null)
                    return;
          if(root.getLeftChild()!=null)
               convertTree(root.getLeftChild(), lastInList);
          BinaryTreeNode<T> current = root;
          if(lastInList!=null){
               current.setLeftChild(lastInList);
               lastInList.setRightChild(current);
          }
          if(this.first){
               this.first = false;
               this.head = current;
          }
          lastInList = current;
          if(root.getRightChild()!=null)
               convertTree(root.getRightChild(),lastInList);
     }

      public BinaryTreeNode<T> convertTreetoDoubleList(BinaryTreeNode<T> root){
          convertTree(root, null);
          return this.head;
     }
}
