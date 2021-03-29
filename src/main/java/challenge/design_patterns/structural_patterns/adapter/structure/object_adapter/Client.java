package challenge.design_patterns.structural_patterns.adapter.structure.object_adapter;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.request();
	}
	
}
