package Problem23;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Common.BinaryTree.BinaryTreeNode;
import Problem6.ConstructBinaryTree;

public class PrintBinayrTreeTest {
	private static BinaryTreeNode<Character> tree;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String preOrder = "12473568";
		String inOrder = "47215386";
		ConstructBinaryTree test = new ConstructBinaryTree();
		tree = test.constructTree(preOrder,inOrder);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintBnaryTreeFromTopToBottom() {
	}

}
