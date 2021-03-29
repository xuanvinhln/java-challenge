package challenge.design_patterns.behavioral_patterns.iterator.menu_ex;

public class MenuItemIterator implements ItemIterator<Item> {
	private int currentIndex = 0;
	private Menu menu;
	
	public MenuItemIterator(Menu menu) {
		this.menu = menu;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < menu.getMenuItems().size();
	}

	@Override
	public Item next() {
		return menu.getMenuItems().get(currentIndex++);
	}
}
