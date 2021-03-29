package challenge.design_patterns.structural_patterns.flyweight.structure;

public class UnsharedConcreteFlyweight extends Flyweight {
	private String allState;

	@Override
	public void operation(String extrinsicState) {
		System.out.println("UnsharedConcreteFlyweight operation " + extrinsicState);
		System.out.println(allState);
	}
}
