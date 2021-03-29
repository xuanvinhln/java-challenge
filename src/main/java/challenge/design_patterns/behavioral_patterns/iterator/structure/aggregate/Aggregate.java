package challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate;

import challenge.design_patterns.behavioral_patterns.iterator.structure.iterator.Iterator;

public interface Aggregate {
	public Iterator createIterator();
}
