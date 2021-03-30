package challenge.concurrent.wait_notify;

public class DivisibleBy3 implements Runnable{
	private Node node;
	private int threshold;
	
	public DivisibleBy3(Node node,  int threshold) {
		this.node = node;
		this.threshold = threshold;
	}
	
	@Override
	public void run() {
		boolean isRunning = true;
		
		while (isRunning) {
			synchronized (node) {
				if (node.getData() > threshold) {
					isRunning = false;
				} else {
					if (node.getData() % 3 == 0 && node.getData() % 5 != 0) {
						System.out.println(this.getClass().getName() + ": " + node.getData());
						node.increase();
					}
				}
			}
		}
	}
}
