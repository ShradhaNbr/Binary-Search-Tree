package BinarySearchTree;

public class myBinaryTree<K extends Comparable<K>> {
	myBinaryNode<K> root;

	public void add(int Key) {
		myBinaryNode<K> newNode = new myBinaryNode<K>(Key);
		if (root == null) {
			root = newNode;
			return;
		} else {
			myBinaryNode<K> current = root;
			myBinaryNode<K> parent = null;
			while (true) {
				parent = current;
				// if key less than root assigning to left
				if (Key < current.key) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				// Assigning key to right
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	/*
	 * Purpose : Method to display the Binary Search Tree
	 * 
	 * @param node
	 */
	public void print(myBinaryNode<K> node) {
		if (node == null) {
			System.out.println("Tree is empty");
		} else {
			if (node.left != null)
				print(node.left);
			System.out.print(node.key + " ");
			if (node.right != null)
				print(node.right);

		}
	}

}
