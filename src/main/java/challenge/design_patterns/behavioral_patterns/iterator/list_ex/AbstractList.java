package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

public interface AbstractList<T> {
	public int count();

	public void append(T item);

	public void remove(T item);

	public Iterator<T> createIterator();
}
