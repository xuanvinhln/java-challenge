package challenge.design_patterns.structural_patterns.flyweight.structure;

public class ConcreteFlyweight extends Flyweight {
	private String intrinsicState;
	
	@Override
	public void operation(String extrinsicState) {
		System.out.println("ConcreteFlyweight operation " + extrinsicState);
		System.out.println(intrinsicState);
	}
}
