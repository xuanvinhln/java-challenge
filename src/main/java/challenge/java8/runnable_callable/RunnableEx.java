package challenge.java8.runnable_callable;

public class RunnableEx {
	public void method1() {
		Runnable r = () -> System.out.println("Hello World!");
		Thread th = new Thread(r);
		th.start();

		r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		th = new Thread(r);
		th.start();
	}
}
