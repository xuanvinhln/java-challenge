package challenge.design_patterns.creational_patterns.builder.structure;

import java.util.List;

public class Director {
	private Builder builder;
	private List<String> structure;
	
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	public Product construct() {
		for (String s : structure) {
			builder.buildPart(s);
		}
		
		return builder.getResult();
	}
}
