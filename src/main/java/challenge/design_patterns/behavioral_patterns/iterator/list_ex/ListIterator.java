package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
	private List<T> list;
	private int index;

	public ListIterator(List<T> list) {
		this.list = list;
		this.index = 0;
	}

	@Override
	public T first() {
		return this.list.get(0);
	}

	@Override
	public T next() {
		index++;
		return this.list.get(index);
	}

	@Override
	public boolean isDone() {
		return index >= this.list.size();
	}

	@Override
	public T currentItem() {
		return this.list.get(index);
	}

}
