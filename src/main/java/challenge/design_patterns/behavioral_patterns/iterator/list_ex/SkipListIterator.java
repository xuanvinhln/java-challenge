package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

import java.util.List;

public class SkipListIterator<T> implements Iterator<T> {
	private String condition;
	private List<T> list;
	private int index;

	public SkipListIterator(List<T> list, String condition) {
		this.list = list;
		this.index = 0;
		this.condition = condition;
	}

	@Override
	public T first() {
		T first = null;
		int i = 0;
		while (first == null && i < this.list.size()) {
			first = this.list.get(i);
			if (!first.toString().equals(condition)) {
				first = null;
				i++;
			}
		}

		return first;
	}

	@Override
	public T next() {
		T next = null;
		while (next == null && index++ < this.list.size()) {
			index++;
			next = this.list.get(index);
			if (!next.toString().equals(condition)) {
				next = null;
			}
		}

		return next;
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
