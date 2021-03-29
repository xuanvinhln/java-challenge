package challenge.data_structures.linked_lists; 

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeTwoSorted {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists2(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode current1, current2, headResult, tailResult;
        headResult = new SinglyLinkedListNode(0);
        tailResult = headResult;
        
        current1 = head1;
        current2 = head2;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                tailResult.next = current1;
                tailResult = current1;
                
                current1 = current1.next;
            } else {
            	tailResult.next = current2;
                tailResult = current2;
                
                current2 = current2.next;
            }
        }
        
        if (current1 == null) {
        	while (current2 != null) {
        		tailResult.next = current2;
                tailResult = current2;
                
                current2 = current2.next;
        	}
        }
        
        if (current2 == null) {
        	while (current1 != null) {
        		tailResult.next = current1;
                tailResult = current1;
                
                current1 = current1.next;
        	}
        }

        headResult = headResult.next;
        
        return headResult;
    }
  
    
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    	
    	if (head1 == null && head2 == null) {
    		return null;
    	}
    	
    	if (head1 == null) {
    		return head2;
    	}
    	
    	if (head2 == null) {
    		return head1;
    	}

    	SinglyLinkedListNode c = null;
    	
    	if (head1.data < head2.data) {
    		c = head1;
    		c.next = mergeLists2(head1.next, head2);
    	} else {
    		c = head2;
    		c.next = mergeLists2(head1, head2.next);
    	}
    	
    	return c;
    }
    
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ", bufferedWriter);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
