package challenge.design_patterns.creational_patterns.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	// Private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
