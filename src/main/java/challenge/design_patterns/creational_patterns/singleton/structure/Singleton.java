package challenge.design_patterns.creational_patterns.singleton.structure;

public class Singleton {
	private static volatile Singleton uniqueInstance;
	private String singletonData;

	public static Singleton instance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}

	public void singletonOperation() {

	}

	public String getSingletonData() {
		return singletonData;
	}
}
