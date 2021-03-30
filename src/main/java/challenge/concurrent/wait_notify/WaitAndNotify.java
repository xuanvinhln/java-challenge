package challenge.concurrent.wait_notify;

public class WaitAndNotify {
	public static boolean flag = true;
	public static final Object lock = new Object();

	public static void main(String[] args) {
		System.out.println("START");

		System.out.println("prepare start thread A");
		Thread t1 = new A("thread A");
		t1.start();

		System.out.println("prepare start thread B");
		Thread t2 = new B("thread B");
		t2.start();
	}
}

class A extends Thread {
	private String threadName;

	public A(String threadName) {
		super(threadName);
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Start thread " + threadName);

		while (true) {
			synchronized (WaitAndNotify.lock) {
				while (WaitAndNotify.flag == true) {
					WaitAndNotify.flag = false;

					System.out.println(threadName + " trying wait");
					try {
						WaitAndNotify.lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			System.out.println(threadName + " Wake up");
		}
	}
}

class B extends Thread {
	private String threadName;

	public B(String threadName) {
		super(threadName);
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Start thread " + threadName);

		while (true) {
			synchronized (WaitAndNotify.lock) {
				while (WaitAndNotify.flag == false) {
					WaitAndNotify.flag = true;

					System.out.println(threadName + " trying notify");
					WaitAndNotify.lock.notifyAll();
					System.out.println(threadName + " has sent the notice");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}