package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

import java.util.ArrayList;
import java.util.List;

public class SkipListImpl<T> implements AbstractList<T> {
	private String condition;
	private List<T> listItem = new ArrayList<T>();
	
	public SkipListImpl(String condition) {
		this.condition = condition;
	}

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
		return new SkipListIterator<T>(listItem, condition);
	}
}
