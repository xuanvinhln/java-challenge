package challenge.design_patterns.behavioral_patterns.iterator.structure.iterator;

import challenge.design_patterns.behavioral_patterns.iterator.structure.aggregate.Aggregate;

public interface Iterator {
	public Aggregate first();

	public Aggregate next();

	public boolean isDone();

	public Aggregate currentItem();
}
