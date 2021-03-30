package challenge.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

class Service implements Runnable {
	private String name;
	private final CountDownLatch latch;

	public Service(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Started service " + this.name);
		latch.countDown();
	}

}

public class CountDownLatchEx2 {

	public static void main(String[] args) {
		// intialising count down latch by 3, as it will wait for 3 threads to
		// finish execution
		CountDownLatch latch = new CountDownLatch(3);

		// making two threads for 3 services
		Thread service1 = new Thread(new Service(latch, "one"));
		Thread service2 = new Thread(new Service(latch, "two"));
		Thread service3 = new Thread(new Service(latch, "three"));

		service1.start();
		service2.start();
		service3.start();

		// latch waits till the count becomes 0
		// this way we can make sure that the execution of main thread only
		// finishes ones 3 services have executed
		try {
			System.out.println("Waiting for 3 services have started ... ");
			latch.await();
			System.out.println("Starting main Thread ... ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done!!!");
	}
}
