package challenge.java8.runnable_callable;

import java.util.concurrent.Callable;

public class CallableEx {
	public void method1() {
		Callable<Integer> callableObj = () -> {
			return 2 * 3;
		};

		callableObj = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return 2 * 3;
			}
		};
	}
}
