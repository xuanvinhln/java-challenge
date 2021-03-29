package challenge.design_patterns.behavioral_patterns.iterator.rudimentary_ex;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {
	public List<DesignPattern> patternList;
	private int position;
	private DesignPattern designPattern;

	public PatternIteratorImpl(List<DesignPattern> patternList) {
		this.patternList = patternList;
	}

	@Override
	public DesignPattern nextPattern() {
		System.out.println("Returning pattern at Position: " + position);
		designPattern = (DesignPattern) patternList.get(position);
		position++;
		return designPattern;
	}

	@Override
	public boolean isLastPattern() {
		if (position < patternList.size()) {
			return false;
		}
		return true;
	}
}