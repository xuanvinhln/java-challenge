package challenge.concurrent.thread;

public class TestInterrupt extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("running...");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			
//			if (Thread.currentThread().isInterrupted()) {
//				break;
//			}
		}
	}

	public static void main(String[] args) {
		TestInterrupt t1 = new TestInterrupt();
		t1.start();
		
		t1.interrupt();
	}
}
