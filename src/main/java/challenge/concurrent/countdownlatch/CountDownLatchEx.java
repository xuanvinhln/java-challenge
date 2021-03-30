package challenge.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * CountDownLatch can solve problem: one-wait-multiple and multiple-wait-one
 */
class Processor implements Runnable {
	private CountDownLatch latch;

	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Processor sleep.");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		latch.countDown();
		System.out.println(Thread.currentThread().getName() + " Processor countDown.");
	}
}

class NextProcess implements Runnable {
	private CountDownLatch latch;

	public NextProcess(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " NextProcess await.");
		try {
			latch.await();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " NextProcess Started.");
	}
}

public class CountDownLatchEx {
	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(1); // coundown from 3 to 0

		ExecutorService executor = Executors.newFixedThreadPool(4); // 3 Threads in pool
		for (int i = 0; i < 3; i++) {
			executor.submit(new NextProcess(latch));
		}
		executor.submit(new Processor(latch));

		try {
			latch.await(); // wait until latch counted down to 0
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " Completed.");
	}
}