package challenge.concurrent.synchronizeds;

class Service1 extends Thread {
	private String lock;

	public Service1(String lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start ...");

		synchronized (lock) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " running ...");
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Service2 extends Thread {
	private String lock;

	public Service2(String lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start ...");

		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + " running ...");
		}
	}
}

public class ReleaseLock {
	public static void main(String[] args) {
		String object = new String("abc");

		Service1 t1 = new Service1(object);
		Service2 t2 = new Service2(object);

		t1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
	}
}
