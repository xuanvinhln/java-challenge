package challenge.design_patterns.behavioral_patterns.command.document_ex;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> listMenuItem;
	
	public Menu() {
		this.listMenuItem = new ArrayList<MenuItem>();
	}
	
	public void add(MenuItem manuItem) {
		this.listMenuItem.add(manuItem);
	}

	public List<MenuItem> getListMenuItem() {
		return listMenuItem;
	}
}
