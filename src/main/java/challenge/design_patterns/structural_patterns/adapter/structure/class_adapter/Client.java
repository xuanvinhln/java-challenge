package challenge.design_patterns.structural_patterns.adapter.structure.class_adapter;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
