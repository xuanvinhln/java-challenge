package challenge.design_patterns.behavioral_patterns.visitor.structure;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Visitor v = new ConcreteVisitor1();

		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());

		List<Element> list = objectStructure.getListElement();
		for (Element e : list) {
			e.accept(v);
		}
	}
}
