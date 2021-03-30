package challenge.concurrent.synchronizeds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import challenge.concurrent.ConcurrentUtils;

public class Synchronized2 {
	private final int NUM_INCREMENTS = 10000;
	private int count = 0;

	public static void main(String[] args) {
		new Synchronized2().testSyncIncrement();
	}

	private void testSyncIncrement() {
		count = 0;
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, NUM_INCREMENTS).forEach(i -> executor.submit(this::incrementSync));

		ConcurrentUtils.stop(executor);
		System.out.println(count);
	}

	private void incrementSync() {
		synchronized (this) {
			count = count + 1;
		}
	}
}