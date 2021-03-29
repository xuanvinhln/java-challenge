package challenge.design_patterns.structural_patterns.composite.structure;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> listChild = new ArrayList<Component>();

	public Composite(List<Component> listChild) {
		this.listChild = listChild;
	}

	@Override
	public void operation() {
		for (Component component : listChild) {
			component.operation();
		}
	}

	@Override
	public void add(Component component) {

	}

	@Override
	public void remove(Component component) {

	}

	@Override
	public void getChild(int index) {

	}

}
