package Problem25;

import java.util.ArrayList;
import java.util.List;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class PrintTreePath {
	private List<Integer> path = new ArrayList<Integer>();

public void printPath(BinaryTreeNode<Integer> root, int currentSum, int sum){
     if(root == null ){
               return;
     }

     currentSum = root.getData() + currentSum;
     if(currentSum<sum){
          this.path.add(root.getData());
          if(root.getLeftChild()!=null)
          printPath(root.getLeftChild(), currentSum, sum);
          if(root.getRightChild()!=null)
          printPath(root.getRightChild(), currentSum, sum);
     }
     else if(currentSum == sum&&root.getRightChild()==null&&root.getLeftChild() == null){
          this.path.add(root.getData());
          for(Integer treeValue: this.path){
                    System.out.print(treeValue);
          }
          System.out.println();
     }
     else{
          return;
     }
     this.path.remove(root.getData());//this can't be forgotten
}
	private static void convert2IntegerTree(BinaryTreeNode<Character> root,BinaryTreeNode<Integer> intRoot){
		if(root!=null){
			Integer value = root.getData() - '0';
			intRoot.setData(value);
			if(root.getLeftChild()!=null){
				intRoot.setLeftChild(new BinaryTreeNode<Integer>());
				convert2IntegerTree(root.getLeftChild(),intRoot.getLeftChild());
				}
			if(root.getRightChild()!=null){
				intRoot.setRightChild(new BinaryTreeNode<Integer>());
				convert2IntegerTree(root.getRightChild(),intRoot.getRightChild());
				}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preOrder = "254783";
		String inOrder = "457238";
		ConstructBinaryTree test = new ConstructBinaryTree();
		BinaryTreeNode<Character> tree = test.constructTree(preOrder,inOrder);
		BinaryTreeNode<Integer> intTree = new BinaryTreeNode<Integer>();
		convert2IntegerTree(tree, intTree);
		PrintTreePath path = new PrintTreePath();
		path.printPath(intTree,0,21);
	}

}
