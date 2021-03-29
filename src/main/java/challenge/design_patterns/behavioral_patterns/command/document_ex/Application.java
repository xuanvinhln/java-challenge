package challenge.design_patterns.behavioral_patterns.command.document_ex;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private List<Document> listDocument;
	private List<Menu> listMenu;
	
	public Application() {
		this.listDocument = new ArrayList<Document>();
		this.listMenu = new ArrayList<Menu>();
	}
	
	public void add(Document document) {
		this.listDocument.add(document);
	}
	
	public void addMenu(Menu menu) {
		this.getListMenu().add(menu);
	}

	public List<Menu> getListMenu() {
		return listMenu;
	}
}
