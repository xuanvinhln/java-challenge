package challenge.design_patterns.behavioral_patterns.strategy.sort_ex;

import challenge.design_patterns.behavioral_patterns.strategy.sort_ex.context.SortedListContext;
import challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy.MergeSort;
import challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy.QuickSort;

public class StrategyPatternExample {
	public static void main(String[] args) {
		SortedListContext sortedListContext = new SortedListContext();
		sortedListContext.add("Chu");
		sortedListContext.add("Xuan");
		sortedListContext.add("Vinh");
		
		sortedListContext.setSortStrategy(new QuickSort());
		sortedListContext.sort();
		
		sortedListContext.setSortStrategy(new MergeSort());
		sortedListContext.sort();
	}
}
