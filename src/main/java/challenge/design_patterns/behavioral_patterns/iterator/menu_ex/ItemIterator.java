package challenge.design_patterns.behavioral_patterns.iterator.menu_ex;

public interface ItemIterator<T> {

	public boolean hasNext();

	public T next();
}