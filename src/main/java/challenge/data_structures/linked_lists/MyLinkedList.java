package challenge.data_structures.linked_lists;

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
