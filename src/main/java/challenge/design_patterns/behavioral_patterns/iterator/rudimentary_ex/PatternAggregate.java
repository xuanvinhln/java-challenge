package challenge.design_patterns.behavioral_patterns.iterator.rudimentary_ex;

public interface PatternAggregate {
	public void addPattern(DesignPattern designPattern);

	public void removePattern(DesignPattern designPattern);

	public PatternIterator getPatternIterator();
}