package challenge.design_patterns.behavioral_patterns.visitor.structure;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> listElement = new ArrayList<Element>();

	public void add(Element e) {
		this.getListElement().add(e);
	}

	public List<Element> getListElement() {
		return listElement;
	}

	public void setListElement(List<Element> listElement) {
		this.listElement = listElement;
	}
}
