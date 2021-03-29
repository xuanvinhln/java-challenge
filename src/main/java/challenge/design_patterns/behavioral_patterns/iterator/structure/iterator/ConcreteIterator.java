package challenge.design_patterns.behavioral_patterns.iterator.structure.iterator;

import challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate.Aggregate;
import challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate.ConcreteAggregate;

public class ConcreteIterator implements Iterator {
	private ConcreteAggregate aggregate;
	private int currentIndex;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		this.currentIndex = 0;
	}

	@Override
	public Aggregate first() {
		return this.aggregate.getList().get(0);
	}

	@Override
	public Aggregate next() {
		currentIndex++;
		return this.aggregate.getList().get(currentIndex);
	}

	@Override
	public boolean isDone() {
		return currentIndex >= this.aggregate.getList().size();
	}

	@Override
	public Aggregate currentItem() {
		return this.aggregate.getList().get(currentIndex);
	}
}
