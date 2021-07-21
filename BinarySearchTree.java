package BinarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) {
		myBinaryTree<Integer> myTree = new myBinaryTree<>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		myTree.print(myTree.root);
	}

}
