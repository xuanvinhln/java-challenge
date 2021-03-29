package challenge.design_patterns.behavioral_patterns.strategy.sort_ex.strategy;

import java.util.List;

public interface SortStrategy {
	public <T> void sort(List<T> items);
}
