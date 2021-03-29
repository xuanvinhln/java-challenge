package challenge.design_patterns.structural_patterns.adapter.structure.object_adapter;

public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		this.adaptee.specificRequest();
	}
}
