package challenge.design_patterns.structural_patterns.adapter.translator_ex;

public class TranslatorAdapter implements VietnameseTarget {
	private JapaneseAdaptee adaptee;
	
	public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
		this.adaptee = japaneseAdaptee;
	}
	
	@Override
	public void send(String words) {
		System.out.println("Reading Words ...");
        System.out.println(words);
        
        String japaneseWords = this.translate(words);
        
        System.out.println("Sending Words ...");
        this.adaptee.receive(japaneseWords);
	}
	
	private String translate(String words) {
		System.out.println("Translated!");
        return "Japanese language";
	}
}
