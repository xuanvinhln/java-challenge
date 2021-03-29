package challenge.design_patterns.behavioral_patterns.strategy.sort_ex.context;

import java.util.ArrayList;
import java.util.List;

import challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy.SortStrategy;

public class SortedListContext {
	private List<String> items;
	private SortStrategy strategy;

	public SortedListContext() {
		 this.items = new ArrayList<String>();
	}
	
	public void setSortStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void sort() {
		this.strategy.sort(items);
	}
	
	public void add(String name) {
		this.items.add(name);
	}
}
