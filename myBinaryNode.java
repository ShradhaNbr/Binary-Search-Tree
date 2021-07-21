package BinarySearchTree;

public class myBinaryNode<K extends Comparable<K>> {
	int key;
	myBinaryNode<K> left;
	myBinaryNode<K> right;

	public myBinaryNode(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
