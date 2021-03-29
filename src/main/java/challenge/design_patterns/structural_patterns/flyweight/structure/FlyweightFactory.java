package challenge.design_patterns.structural_patterns.flyweight.structure;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static volatile FlyweightFactory instance;
	private Map<String, Flyweight> flyweightPool = new HashMap<String, Flyweight>();

	private FlyweightFactory() {

	}

	public static FlyweightFactory getInstance() {
		if (instance == null) {
			synchronized (FlyweightFactory.class) {
				if (instance == null) {
					return new FlyweightFactory();
				}
			}
		}

		return instance;
	}

	public Flyweight getFlyweight(String key) {
		if (flyweightPool.containsKey(key)) {
			return flyweightPool.get(key);
		} else {
			Flyweight f = null;

			if (key.equals(ConcreteFlyweight.class.getSimpleName())) {
				f = new ConcreteFlyweight();
				flyweightPool.put(ConcreteFlyweight.class.getSimpleName(), f);
			}

			if (key.equals(UnsharedConcreteFlyweight.class.getSimpleName())) {
				f = new UnsharedConcreteFlyweight();
				flyweightPool.put(UnsharedConcreteFlyweight.class.getSimpleName(), f);
			}

			return f;
		}
	}
}
