package challenge.design_patterns.behavioral_patterns.strategy.linebreaking_ex;

public class Client {
	public static void main(String[] args) {
		SimpleCompositor simpleCompositor = new SimpleCompositor();
		ArrayCompositor arrayCompositor = new ArrayCompositor();

		Composition composition = new Composition(simpleCompositor);
		composition.repair();

		composition.setCompositor(arrayCompositor);
		composition.repair();
	}
}
