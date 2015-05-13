package Problem23;

import java.util.LinkedList;
import java.util.Queue;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class PrintBinaryTree<T> {
	 public void printBnaryTreeFromTopToBottom(Queue<BinaryTreeNode<T>> treeNodes){
         Queue<BinaryTreeNode<T>> newNodeQueue = new LinkedList<BinaryTreeNode<T>>();
         if(treeNodes == null || treeNodes.isEmpty()){
//              System.out.println("input data is invalid");
              return ;
         }
         while(!treeNodes.isEmpty()){
              BinaryTreeNode<T> node = treeNodes.poll();
              if(node!=null){
                   System.out.println(node.getData());
              if(node.getLeftChild()!=null){
                   newNodeQueue.add(node.getLeftChild());
              }
              if(node.getRightChild()!=null){
                   newNodeQueue.add(node.getRightChild());
              }
              }
         }
         printBnaryTreeFromTopToBottom(newNodeQueue);
    }
	 public static void main(String [] args){
		 String preOrder = "12473568";
			String inOrder = "47215386";
			ConstructBinaryTree test = new ConstructBinaryTree();
			BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
			PrintBinaryTree<Character> printTree = new PrintBinaryTree<Character>();
			 Queue<BinaryTreeNode<Character>> QueueTest = new LinkedList<BinaryTreeNode<Character>>();
			 QueueTest.add(tree);
			printTree.printBnaryTreeFromTopToBottom(QueueTest);
	 }

}
