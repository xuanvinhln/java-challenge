package challenge.data_structures.linked_lists;

public class SumLists {
	public class Node {
		int value;
		Node next;
		
		public Node() {
			
		}
		
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
		
		public void addNext(Node node) {
			this.next = node;
		}
	}
	
	public class MyLinkedList {
		Node head = null;
		Node tail = null;
		
		public MyLinkedList() {
			this.head = null;
			this.tail = null;
		}
		
		public void insertHead(Node node) {
			if (this.head == null) {
				this.head = node;
				this.tail = node;
			} else {
				node.next = head;
				this.head = node;
			}
		}
		
		public void insertTail(Node node) {
			if (this.tail == null) {
				this.tail = node;
				this.head = node;
			} else {
				this.tail.next = node;
				this.tail = node;
			}
		}
	}
	
	public Node addLists(Node l1, Node l2, int carry) {
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		
		int value = carry;
		if (l1 != null) {
			value += l1.value;
 		}
		if (l2 != null) {
			value += l2.value;
		}

		Node newNode = new Node(value % 10);
		
		Node more = addLists(l1 == null? null: l1.next, l2 == null? null: l2.next, value < 10? 0:1);
		newNode.addNext(more);
		
		return newNode;
	}

	public void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.value + "->");
			head = head.next;
		}
		
		System.out.println("null");
	}
	
	public void run() {
		MyLinkedList l1 = new MyLinkedList();
		l1.insertHead(new Node(8));
		l1.insertHead(new Node(1));
		l1.insertHead(new Node(6));
		l1.insertHead(new Node(2));
		l1.insertHead(new Node(4));
		
		MyLinkedList l2 = new MyLinkedList();
		l2.insertHead(new Node(9));
		l2.insertHead(new Node(9));
		l2.insertHead(new Node(9));
		l2.insertHead(new Node(9));
		l2.insertHead(new Node(9));
		
		printLinkedList(l1.head);
		printLinkedList(l2.head);
		
		Node nd = addLists(l1.head, l2.head, 0);
		printLinkedList(nd);
	}
	
	public static void main(String[] args) {
		new SumLists().run();
	}
}
