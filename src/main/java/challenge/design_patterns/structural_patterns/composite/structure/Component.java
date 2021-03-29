package challenge.design_patterns.structural_patterns.composite.structure;

public interface Component {
	public void operation();
	public void add(Component component);
	public void remove(Component component);
	public void getChild(int index);
}
