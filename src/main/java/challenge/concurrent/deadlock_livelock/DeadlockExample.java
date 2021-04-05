package challenge.concurrent.deadlock_livelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * To start with, we should avoid the need for acquiring multiple locks for a thread. However,
 *  if a thread does need multiple locks, we should make sure that each thread acquires the locks in the same order, to avoid any cyclic dependency in lock acquisition.
 * We can also use timed lock attempts, like the tryLock method in the Lock interface,
 *  to make sure that a thread does not block infinitely if it is unable to acquire a lock.
 */
public class DeadlockExample {

	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {
		DeadlockExample deadlock = new DeadlockExample();

		new Thread(deadlock::operation1, "T1").start();
		new Thread(deadlock::operation2, "T2").start();

	}

	public void operation1() {
		lock1.lock();
		print("lock1 acquired, waiting to acquire lock2.");
		sleep(50);

		lock2.lock();
		print("lock2 acquired");

		print("executing first operation.");

		lock2.unlock();
		lock1.unlock();

	}

	public void operation2() {
		lock2.lock();
		print("lock2 acquired, waiting to acquire lock1.");
		sleep(50);

		lock1.lock();
		print("lock1 acquired");

		print("executing second operation.");

		lock1.unlock();
		lock2.unlock();
	}

	public void print(String message) {
		System.out.println("Thread " + Thread.currentThread().getName() + ": " + message);
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}