package challenge.design_patterns.creational_patterns.singleton;

public class ThreadSafeLazyInitializedSingleton {
	private static volatile ThreadSafeLazyInitializedSingleton instance;

	private ThreadSafeLazyInitializedSingleton() {
	}

	public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeLazyInitializedSingleton();
		}
		return instance;
	}
}
