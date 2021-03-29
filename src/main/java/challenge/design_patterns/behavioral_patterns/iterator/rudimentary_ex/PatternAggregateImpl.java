package challenge.design_patterns.behavioral_patterns.iterator.rudimentary_ex;

import java.util.ArrayList;
import java.util.List;

public class PatternAggregateImpl implements PatternAggregate {
	private List<DesignPattern> patternList;

	public PatternAggregateImpl() {
		patternList = new ArrayList<DesignPattern>();
	}

	@Override
	public void addPattern(DesignPattern designPattern) {
		patternList.add(designPattern);
	}

	@Override
	public void removePattern(DesignPattern designPattern) {
		patternList.remove(designPattern);
	}

	@Override
	public PatternIterator getPatternIterator() {
		return new PatternIteratorImpl(patternList);
	}
}