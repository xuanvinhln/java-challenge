package challenge.data_structures.linked_lists;

public class IsPalindrome {
	public class Result {
		Node node;
		boolean flag;
		
		public Result (Node node, boolean flag) {
			this.node = node;
			this.flag = flag;
		}
	}
	
	public boolean isPalindrome(Node head) {
		int length = getLengthOfList(head);
		
		Result result = isPalindromeRecurse(head, length);
		
		return result.flag;
	}
	
	public Result isPalindromeRecurse(Node node, int length) {
		if (node == null || length <= 0) {
			return new Result(node, true);
		} else if (length == 1) {
			return new Result(node.next, true);
		}
		
		Result ans = isPalindromeRecurse(node.next, length - 2);
		
		if (!ans.flag || ans.node == null) {
			return ans;
		}
		
		ans.flag = (ans.node.value == node.value);
		ans.node = ans.node.next;
		
		return ans;
	}
	
	public int getLengthOfList(Node head) {
		int length = 0;
		
		while (head != null) {
			length++;
			head = head.next;
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(0);
		ll.add(1);
		
		System.out.println(new IsPalindrome().isPalindrome(ll.head));
	}
}
