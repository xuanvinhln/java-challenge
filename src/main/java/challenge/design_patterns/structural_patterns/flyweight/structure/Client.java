package challenge.design_patterns.structural_patterns.flyweight.structure;

public class Client {
	public static void main(String[] args) {
		Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(ConcreteFlyweight.class.getSimpleName());
		flyweight.operation("extrinsicState");
	}
}
