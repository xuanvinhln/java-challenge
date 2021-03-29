package challenge.design_patterns.behavioral_patterns.command.editor_ex;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private List<String> words;

	public Document() {
		this.words = new ArrayList<String>();
	}

	public void write(String text, int position) {
		System.out.println(Document.class.getSimpleName() + " write");
		
		while (this.words.size() < position) {
			this.words.add(null);
		}

		this.words.add(position, text);
	}

	public void delete(int position) {
		System.out.println(Document.class.getSimpleName() + " delete");
		
		if (this.words.size() <= position) {
			System.out.println(Document.class.getSimpleName() + " delete error");
			return;
		}

		this.words.remove(position);
	}
	
	public String getWord(int position) {
		System.out.println(Document.class.getSimpleName() + " getWord");
		
		if (this.words.size() <= position) {
			System.out.println(Document.class.getSimpleName() + " getWord error");
			return null;
		}
		
		return this.words.get(position);
	}

	public void readDocument() {
		System.out.println(Document.class.getSimpleName() + " readDocument");
		
		for (String line : words) {
			System.out.println(line);
		}
	}

	public List<String> getWords() {
		return words;
	}
}
