package challenge.concurrent.wait_notify;

public class Node {
	private int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void increase() {
		this.data++;
	}
	
	public static void main(String[] args) {
		Node node = new Node(1);
		int threshold = 50;
		
		Thread t1 = new Thread(new DivisibleBy3(node, threshold));
		t1.setName("Thread 1");
		
		Thread t2 = new Thread(new DivisibleBy5(node, threshold));
		t2.setName("Thread 2");
		
		Thread t3 = new Thread(new DivisibleBy15(node, threshold));
		t3.setName("Thread 3");
		
		Thread t4 = new Thread(new NotDivisibleBy3And5(node, threshold));
		t4.setName("Thread 4");
		
		System.out.println("Start");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
