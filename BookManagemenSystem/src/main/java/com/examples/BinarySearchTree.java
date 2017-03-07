package com.examples;
public class BinarySearchTree {
	private Comparable data;
	static int counter;
	private BinarySearchTree left;
	private BinarySearchTree right;

	private static BinarySearchTree root;

	/**
	 * Tree constructor
	 */
	public BinarySearchTree() {
	    root = null;
	}

	/**
	 * Node constructor
	 */
	private BinarySearchTree(Comparable data) {
	    this.data = data;
	    left = null;
	    right = null;
	}

	/**
	 * Tree method to add new element
	 * 
	 * @param data is a new data we want to add to a tree
	 */
	public void addToTree(int [] a) {
		 counter=0;
		 for(int i=0;i<a.length;i++){
			 int data=a[i];
	    if (root == null)
	        root = new BinarySearchTree(data);
	    else
	        add(root, data);
	    System.out.println(counter);
	}}

	// Private method that add new element
	private void add(BinarySearchTree target, Comparable data ) {
		counter=counter+1;
	    if (data.compareTo(target.data)<0) {
	        if (target.left == null)
	            target.left = new BinarySearchTree(data);
	        else
	            add(target.left, data);
	    } else {
	        if (target.right == null)
	            target.right = new BinarySearchTree(data);
	        else
	            add(target.right, data);
	    }
	  

	}

	


	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
	   // tree.addToTree(3);
	    int a[]={1,2,3};
	    tree.addToTree(a);
	   /** tree.addToTree(2);
	    tree.addToTree(1);
	    tree.addToTree(3);
	   // tree.addToTree(2);
	   // tree.printTree();**/
	}

}
