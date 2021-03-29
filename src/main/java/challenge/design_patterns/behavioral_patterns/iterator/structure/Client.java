package challenge.design_patterns.behavioral_patterns.iterator.structure;

import challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate.Aggregate;
import challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate.ConcreteAggregate;
import challenge.design_patterns.behavioral_patterns.iterator.structure.iterator.Iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		Iterator iter = aggregate.createIterator();

		while (!iter.isDone()) {
			System.out.println(iter.currentItem());
			iter.next();
		}
	}
}
