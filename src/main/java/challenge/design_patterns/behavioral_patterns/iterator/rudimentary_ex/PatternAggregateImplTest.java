package challenge.design_patterns.behavioral_patterns.iterator.rudimentary_ex;

/*
 * Aggregate (PatternAggregate): Is an interface that declares the methods to create and return an iterator.
 * 
 * ConcreteAggregate (PatternAggregateImpl): Is a concrete class that implements the Aggregate interface to create and return an iterator.
 * 
 * Iterator (PatternIterator): Is an interface with methods to allow clients to access and traverse elements.
 * 
 * ConcreteIterator (PatternIteratorImpl): Is a concrete class that implements the Iterator interface. 
 */
public class PatternAggregateImplTest {
	public static void main(String[] args) {
		DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
		DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory");
		DesignPattern pattern3 = new DesignPattern("Structural", "Adapter");
		DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
		DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain of Responsibility");
		DesignPattern pattern6 = new DesignPattern("Behavioral", "Iterator");

		PatternAggregate patternAggregate = new PatternAggregateImpl();
		patternAggregate.addPattern(pattern1);
		patternAggregate.addPattern(pattern2);
		patternAggregate.addPattern(pattern3);
		patternAggregate.addPattern(pattern4);
		patternAggregate.addPattern(pattern5);
		patternAggregate.addPattern(pattern6);
		System.out.println("-----Pattern list-----");
		printPatterns(patternAggregate);

		patternAggregate.removePattern(pattern1);
		patternAggregate.removePattern(pattern2);
		System.out.println("-----Pattern list after removal operation-----");
		printPatterns(patternAggregate);
	}

	public static void printPatterns(PatternAggregate patternAggregate) {
		PatternIterator patternIterator = patternAggregate.getPatternIterator();
		while (!patternIterator.isLastPattern()) {
			DesignPattern designPattern = patternIterator.nextPattern();
			System.out.println(designPattern.getPatternType() + " : " + designPattern.getPatternName());
		}
	}
}
