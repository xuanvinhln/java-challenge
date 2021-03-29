package challenge.design_patterns.structural_patterns.adapter.structure.class_adapter;

public class Adapter implements Target, Adaptee{

	@Override
	public void specificRequest() {
		System.out.println("Do specificRequest");
	}

	@Override
	public void request() {
		this.specificRequest();
	}
}
