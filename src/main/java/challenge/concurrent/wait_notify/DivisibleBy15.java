package challenge.concurrent.wait_notify;

public class DivisibleBy15 implements Runnable{
	private Node node;
	private int threshold;
	
	public DivisibleBy15(Node node, int threshold) {
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
					if (node.getData() % 15 == 0) {
						System.out.println(this.getClass().getName() + ": " + node.getData());
						node.increase();
					}
				}
			}
		}
	}
}
