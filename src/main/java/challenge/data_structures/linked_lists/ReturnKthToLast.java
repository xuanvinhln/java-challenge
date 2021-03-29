package challenge.data_structures.linked_lists;

public class ReturnKthToLast {
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

	public final class Index {
		public int index = 0;
		public Node node;
	}
	
	public Node kthToLast(Node head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}
	
	public Node kthToLast(Node head, int k, Index idx) {
		if (head == null) {
			return null;
		}
		
		Node nd = kthToLast(head.next, k, idx);
		idx.index++;
		if (idx.index == k) {
			idx.node = head;
			return head;
		}
		
		return nd;
	}
	
	public void run() {
		MyLinkedList lk = new MyLinkedList();
		lk.add(5);
		lk.add(4);
		lk.add(3);
		lk.add(2);
		lk.add(1);
		
		Node nd = kthToLast(lk.head, 2);
		System.out.println(nd.value);
	}
	
	public static void main(String[] args) {
		new ReturnKthToLast().run();
	}
}
