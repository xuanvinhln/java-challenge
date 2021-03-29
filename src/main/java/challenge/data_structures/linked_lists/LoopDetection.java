package challenge.data_structures.linked_lists;

public class LoopDetection {
	public Node detection(Node head) {
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				break;
			}
		}
		
		if (fast == null || fast.next == null) {
			return null;
		}
		
		slow = head;
		
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(6);
		ll.add(5);
		ll.add(4);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		Node pointer = ll.head;
		 
		while (pointer.next != null) {
			pointer = pointer.next;
		}
		
		Node nodeLoop = ll.head.next.next;
		pointer.next = nodeLoop;
		
		System.out.println("Loop detection");
		
		Node node = new LoopDetection().detection(ll.head);
		if (node != null) {
			System.out.println(node.value);
		} else {
			System.out.println(node);
		}
	}
}
