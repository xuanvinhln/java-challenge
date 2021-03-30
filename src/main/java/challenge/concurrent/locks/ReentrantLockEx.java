package challenge.concurrent.locks;

import java.util.concurrent.locks.ReentrantLock;

class Task extends Thread {
	ReentrantLock lock;

	public Task(ReentrantLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		// the unlock number needs to be equal to the lock number
		lock.lock();
		lock.lock();
		lock.unlock();
		lock.unlock();
	}
}

public class ReentrantLockEx {
	public static void main(String[] args) {
		System.out.println("Start");

		ReentrantLock lock = new ReentrantLock();

		Task t1 = new Task(lock);
		t1.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lock.lock();
		System.out.println("ABC");
	}
}
