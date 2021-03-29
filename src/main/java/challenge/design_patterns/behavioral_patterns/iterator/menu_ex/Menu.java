package challenge.design_patterns.behavioral_patterns.iterator.menu_ex;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Aggregate {
	private List<Item> menuItems = new ArrayList<>();

	public void addItem(Item item) {
		getMenuItems().add(item);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ItemIterator<Item> iterator() {
		return new MenuItemIterator(this);
	}

	public List<Item> getMenuItems() {
		return menuItems;
	}
}