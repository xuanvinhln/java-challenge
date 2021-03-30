package challenge.concurrent.volatilekeyword;

public class TaskRunner {
	private static int number;
	private volatile static boolean ready;

	private static class Reader extends Thread {

		@Override
		public void run() {
			while (!ready) {
				System.out.println("yield");
				Thread.yield();
			}

			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new Reader().start();
		number = 42;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ready = true;
	}
}