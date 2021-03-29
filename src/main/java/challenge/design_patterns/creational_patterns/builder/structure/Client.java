package challenge.design_patterns.creational_patterns.builder.structure;

public class Client {
	public static void main(String[] args) {
		Director director = new Director(new ConcreteBuilder());
		Product product = director.construct();
		product.toString();
	}
}
