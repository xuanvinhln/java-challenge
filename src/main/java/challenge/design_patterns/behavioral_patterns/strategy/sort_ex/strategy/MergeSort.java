package challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy;

import java.util.List;

public class MergeSort implements SortStrategy {
	@Override
	public <T> void sort(List<T> items) {
		System.out.println("MergeSort");
	}
}
