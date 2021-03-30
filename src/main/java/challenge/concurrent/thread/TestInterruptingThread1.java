package challenge.concurrent.thread;

public class TestInterruptingThread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted...\n" + e);
		}

		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		TestInterruptingThread1 t1 = new TestInterruptingThread1();
		t1.start();
		t1.interrupt();
	}
}