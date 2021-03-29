package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

public interface Iterator<T> {
	public T first();

	public T next();

	public boolean isDone();

	public T currentItem();
}
