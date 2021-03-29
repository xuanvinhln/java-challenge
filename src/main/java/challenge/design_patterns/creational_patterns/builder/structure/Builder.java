package challenge.design_patterns.creational_patterns.builder.structure;

public interface Builder {
	public void buildPart(String namePart);
	public Product getResult();
}
