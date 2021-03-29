package challenge.design_patterns.creational_patterns.builder.structure;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBuilder implements Builder {
	private String attribute1;
	private String attribute2;
	
	@Override
	public void buildPart(String namePart) {
		if (namePart.equals(this.attribute1)) {
			this.attribute1 = "assign by something";
		}
		
		if (namePart.equals(this.attribute2)) {
			this.attribute2 = "assign by something";
		}
	}
	
	@Override
	public Product getResult() {
		List<String> list = new ArrayList<String>();
		list.add(this.attribute1);
		list.add(this.attribute2);
		
		return new Product(list);
	}
}
