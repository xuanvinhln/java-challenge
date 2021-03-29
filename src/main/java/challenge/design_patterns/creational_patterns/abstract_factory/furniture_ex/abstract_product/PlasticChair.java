package challenge.design_patterns.creational_patterns.abstract_factory.furniture_ex.abstract_product;

public class PlasticChair implements Chair {
	@Override
	public void create() {
		System.out.println("Create plastic chair");
	}

}
