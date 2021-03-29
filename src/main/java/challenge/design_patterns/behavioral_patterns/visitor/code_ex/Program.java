package challenge.design_patterns.behavioral_patterns.visitor.code_ex;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private List<Node> nodes = new ArrayList<Node>();

	public void addNode(Node node) {
		this.nodes.add(node);
	}

	public List<Node> getNodes() {
		return nodes;
	}
}
