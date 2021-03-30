package challenge.concurrent.cyclicbarrier;

import java.util.Date;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String[] args) {

		// 4 threads are part of the barrier, ServiceOne, ServiceTwo, ServiceThree and
		// this main thread calling them.
		final CyclicBarrier barrier = new CyclicBarrier(4);

		Thread service1 = new Thread(new Service(barrier, "one"));
		Thread service2 = new Thread(new Service(barrier, "two"));
		Thread service3 = new Thread(new Service(barrier, "three"));
		System.out.println("Starting both the services at" + new Date());

		service1.start();
		service2.start();
		service3.start();

		try {
			barrier.await();
		} catch (Exception e) {
			System.out.println("Main Thread interrupted!");
			e.printStackTrace();
		}

		System.out.println("Ending both the services at" + new Date());
	}
}
