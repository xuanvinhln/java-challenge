package challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy;

import java.util.List;

public class SelectionSort implements SortStrategy {
	@Override
	public <T> void sort(List<T> items) {
		System.out.println("SelectionSort");
	}
}
