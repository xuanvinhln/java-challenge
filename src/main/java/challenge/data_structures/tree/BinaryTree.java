package challenge.data_structures.tree;

public class BinaryTree {
	private Node root;
	
	private Node prev;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public BinaryTree(Node node) {
		this.root = node;
	}
	
	public void insertNode(Node node) {
		if (this.root == null) {
			this.root = node;
			
			return;
		}
		
		Node prev = null;
		Node cur = this.root;
		boolean isLeft = true;
		
		while (cur != null) {
			prev = cur;
			
			if (node.data <= prev.data) {
				cur = prev.left;
				isLeft = true;
			} else {
				cur = prev.right;
				isLeft = false;
			}
		}
		
		if (isLeft) {
			prev.left = node;
		} else {
			prev.right = node;
		}
	}
	
	public void insertNode(int data) {
		Node node = new Node(data);
		
		if (this.root == null) {
			this.root = node;
			return;
		}
		
		Node cur = this.root;
		while (true) {
			if (node.data <= cur.data) {
				if (cur.left != null) {
					cur = cur.left;
				} else {
					cur.left = node;
					break;
				}
			} else {
				if (cur.right != null) {
					cur = cur.right;
				} else {
					cur.right = node;
					break;
				}
			}
		}
	}
	
	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			postOrder(root.left);
			postOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	boolean isBST1() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
 
	boolean isBSTUtil(Node node, int min, int max) {
		if (node == null)
			return true;

		if (node.data < min || node.data > max)
			return false;

		return (isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max));
	}
	// -----------------------------------------------------------
	
	// Returns true if given tree is BST.  
	boolean isBST2(Node root, Node l, Node r)  
	{  
	    // Base condition  
	    if (root == null)  
	        return true;  
	  
	    // if left node exist then check it has  
	    // correct data or not i.e. left node's data  
	    // should be less than root's data  
	    if (l != null && root.data <= l.data)  
	        return false;  
	  
	    // if right node exist then check it has  
	    // correct data or not i.e. right node's data  
	    // should be greater than root's data  
	    if (r != null && root.data >= r.data)  
	        return false;  
	  
	    // check recursively for every node.  
	    return isBST2(root.left, l, root) &&  
	        isBST2(root.right, root, r);  
	} 
	// -----------------------------------------------------------
	
	boolean isBST3() {
		prev = null;
		return isBST3(root);
	}

	/*
	 * Returns true if given search tree is binary search tree (efficient version)
	 */
	boolean isBST3(Node node) {
		// traverse the tree in inorder fashion and
		// keep a track of previous node
		if (node != null) {
			if (!isBST3(node.left))
				return false;

			// allows only distinct values node
			if (prev != null && node.data <= prev.data)
				return false;
			
			prev = node;
			return isBST3(node.right);
		}
		
		return true;
	}
    
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
//		tree.insertNode(new Node(5));
//		tree.insertNode(new Node(2));
//		tree.insertNode(new Node(1));
//		tree.insertNode(new Node(9));
//		tree.insertNode(new Node(8));
		
		tree.insertNode(5);
		tree.insertNode(2);
		tree.insertNode(1);
		tree.insertNode(9);
		tree.insertNode(8);
		
		System.out.println("\nTraversal: ");
		tree.preOrder(tree.root);
		System.out.println("\nTraversal: ");
		tree.postOrder(tree.root);
		System.out.println("\nTraversal: ");
		tree.inOrder(tree.root);
		
		if (tree.isBST1())
			System.out.println("IS BST");
		else {
			System.out.println("Not a BST");
		}
		
		if (tree.isBST2(tree.root, null, null))
			System.out.println("IS BST");
		else {
			System.out.println("Not a BST");
		}
		
		if (tree.isBST3())
			System.out.println("IS BST");
		else {
			System.out.println("Not a BST");
		}
	}
}
