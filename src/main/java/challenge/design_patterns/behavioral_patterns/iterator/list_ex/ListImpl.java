package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

import java.util.ArrayList;
import java.util.List;

public class ListImpl<T> implements AbstractList<T> {
	private List<T> listItem = new ArrayList<T>();

	@Override
	public int count() {
		return this.listItem.size();
	}

	@Override
	public void append(T item) {
		this.listItem.add(item);
	}

	@Override
	public void remove(T item) {
		this.remove(item);
	}

	@Override
	public Iterator<T> createIterator() {
		return new ListIterator<T>(listItem);
	}
}
