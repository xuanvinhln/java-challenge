package challenge.design_patterns.structural_patterns.composite.structure;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Component> list = new ArrayList<Component>();
		Component component = new Composite(list);
		component.operation();

		component = new Leaf();
		component.operation();
	}
}
