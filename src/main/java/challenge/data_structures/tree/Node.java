package challenge.data_structures.tree;

public class Node {
	public int data;
	
	public Node left;
	public Node right;
	
	public Node(int data) {
		this.data = data;
		
		this.left = null;
		this.right = null;
	}
	
	public static Node insertNode(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} 
		
		Node cur = null;
		if (data <= root.data) {
			cur = Node.insertNode(root.left, data);
			root.left = cur;
			
		} else {
			cur = Node.insertNode(root.right, data);
			root.right = cur;
		}
		
		return root;
	}
	
	public static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			postOrder(root.left);
			postOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		Node root = null;
		
		root = Node.insertNode(root, 5);
		root = Node.insertNode(root, 2);
		root = Node.insertNode(root, 1);
		root = Node.insertNode(root, 9);
		root = Node.insertNode(root, 8);
		
		System.out.println("\nTraversal: ");
		Node.preOrder(root);
		System.out.println("\nTraversal: ");
		Node.postOrder(root);
		System.out.println("\nTraversal: ");
		Node.inOrder(root);
	}
}
