package challenge.design_patterns.behavioral_patterns.command.document_ex;

public class Document {
	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public void open() {
		System.out.println(Document.class.getSimpleName() + " open " + name);
	}
	
	public void close() {
		System.out.println(Document.class.getSimpleName() + " close " + name);
	}
	
	public void cut() {
		System.out.println(Document.class.getSimpleName() + " cut " + name);
	}
	
	public void copy() {
		System.out.println(Document.class.getSimpleName() + " copy " + name);
	}
	
	public void paste() {
		System.out.println(Document.class.getSimpleName() + " paste " + name);
	}
}
