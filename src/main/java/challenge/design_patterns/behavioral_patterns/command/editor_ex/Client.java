package challenge.design_patterns.behavioral_patterns.command.editor_ex;

public class Client {
	public static void main(String[] args) {
		Document document = new Document();
		DocumentInvoker involker = new DocumentInvoker(document);
		
		involker.write("The 1st text. ", 0);
		involker.undo();
		involker.read(); // EMPTY
         
		involker.redo();
		involker.read(); // The 1st text.
 
		involker.write("The 2nd text. ", 1);
		involker.write("The 3rd text. ", 2);
		involker.read(); // The 1st text. The 2nd text. The 3rd text. 
		involker.undo(); // The 1st text. The 2nd text.
		involker.undo(); // The 1st text.
		involker.undo(); // EMPTY
		involker.undo(); // Nothing to undo
	}
}
