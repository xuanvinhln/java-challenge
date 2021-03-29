package challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.behavioral_patterns.iterator.structure.iterator.ConcreteIterator;
import challenge.design_patterns.behavioral_patterns.iterator.structure.iterator.Iterator;

public class ConcreteAggregate implements Aggregate {
	private List<Aggregate> list = new ArrayList<Aggregate>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public void addAggregate(Aggregate aggregate) {
		this.list.add(aggregate);
	}

	public List<Aggregate> getList() {
		return list;
	}
}
