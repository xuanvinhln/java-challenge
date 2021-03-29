package challenge.design_patterns.behavioral_patterns.iterator.menu_ex;

public interface Aggregate {
	public <T> ItemIterator<T> iterator();
}
