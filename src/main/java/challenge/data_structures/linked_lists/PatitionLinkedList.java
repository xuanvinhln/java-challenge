package challenge.data_structures.linked_lists;

public class PatitionLinkedList {
	public class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	public class MyLinkedList {
		Node head = null;
		
		public MyLinkedList() {
			this.head = null;
		}
		
		public void add(int value) {
			Node newNode = new Node(value);
			if (this.head == null) {
				this.head = newNode;
			} else {
				newNode.next = head;
				this.head = newNode;
			}
		}
	}

	public Node patition(Node node, int x) {
		Node head = node;
		Node tail = node;
		
		Node next = node;
		while (node != null) {
			next = node.next;
			
			if (node.value < x) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			
			node = next;
		}
		tail.next = null;
		
		return head;
	}
	
	public void printLinkedList(MyLinkedList ll) {
		Node head = ll.head;
		
		while (head != null) {
			System.out.print(head.value + "->");
			head = head.next;
		}
		
		System.out.println("null");
	}
	
	public void run() {
		MyLinkedList ll = new MyLinkedList();
		ll.add(5);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(4);
		
		printLinkedList(ll);
		ll.head = patition(ll.head, 4);
		
		printLinkedList(ll);
	}
	
	public static void main(String[] args) {
		new PatitionLinkedList().run();
	}
}
