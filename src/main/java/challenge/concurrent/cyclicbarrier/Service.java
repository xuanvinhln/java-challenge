package challenge.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Service implements Runnable {
	private String name;
	private final CyclicBarrier cyclicBarrier;

	public Service(CyclicBarrier cyclicBarrier, String name) {
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting service " + this.name);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Service " + this.name + " has finished its work.. waiting for others...");
		try {
			cyclicBarrier.await();
		} catch (Exception e) {
			System.out.println("Service " + this.name + " interrupted!");
			e.printStackTrace();
		}
		System.out.println("The wait is over, lets complete Service " + this.name);
	}
}